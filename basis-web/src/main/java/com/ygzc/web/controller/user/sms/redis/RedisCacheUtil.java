/**
 * 
 */
package com.ygzc.web.controller.user.sms.redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.util.Pool;

/**
 * @author yanl.fu
 *
 */
/*@Component*/
public class RedisCacheUtil<T> {

	private Logger logger = Logger.getLogger(RedisCacheUtil.class);
	
	/**
	 * 主服务器数据源连接池(主要用于写操作)
	 */
	private JedisPool jedisPool = null;
	// private Jedis jedis = null;

	/**
	 * 数据源共享连接池,主要用于读取数据(暂时没有使用)
	 */
	private ShardedJedisPool shardedJedisPool = null;
	
	@Resource(name="redisTemplate")
	public RedisTemplate redisTemplate;
	
	 /**
	  * 缓存基本的对象，Integer、String、实体类等
	  * @param key 缓存的键值
	  * @param value 缓存的值
	  * @return  缓存的对象
	  */
	 public <T> ValueOperations<String,T> setCacheObject(String key,T value)
	 {
	   
	  ValueOperations<String,T> operation = redisTemplate.opsForValue(); 
	  operation.set(key,value);
	  return operation;
	 }
	  
	 /**
	  * 获得缓存的基本对象。
	  * @param key  缓存键值
	  * @param operation
	  * @return   缓存键值对应的数据
	  */
	 public <T> T getCacheObject(String key/*,ValueOperations<String,T> operation*/)
	 {
	  ValueOperations<String,T> operation = redisTemplate.opsForValue(); 
	  return operation.get(key);
	 }
	  
	 /**
	  * 缓存List数据
	  * @param key  缓存的键值
	  * @param dataList 待缓存的List数据
	  * @return   缓存的对象
	  */
	 public <T> ListOperations<String, T> setCacheList(String key,List<T> dataList)
	 {
	  ListOperations listOperation = redisTemplate.opsForList();
	  if(null != dataList)
	  {
	   int size = dataList.size();
	   for(int i = 0; i < size ; i ++)
	   {
	     
	    listOperation.rightPush(key,dataList.get(i));
	   }
	  }
	   
	  return listOperation;
	 }
	  
	 /**
	  * 获得缓存的list对象
	  * @param key 缓存的键值
	  * @return  缓存键值对应的数据
	  */
	 public <T> List<T> getCacheList(String key)
	 {
	  List<T> dataList = new ArrayList<T>();
	  ListOperations<String,T> listOperation = redisTemplate.opsForList();
	  Long size = listOperation.size(key);
	   
	  for(int i = 0 ; i < size ; i ++)
	  {
	   dataList.add((T) listOperation.leftPop(key));
	  }
	   
	  return dataList;
	 }
	  
	 /**
	  * 缓存Set
	  * @param key  缓存键值
	  * @param dataSet 缓存的数据
	  * @return   缓存数据的对象
	  */
	 public <T> BoundSetOperations<String,T> setCacheSet(String key,Set<T> dataSet)
	 {
	  BoundSetOperations<String,T> setOperation = redisTemplate.boundSetOps(key); 
	  /*T[] t = (T[]) dataSet.toArray();
	    setOperation.add(t);*/
	   
	   
	  Iterator<T> it = dataSet.iterator();
	  while(it.hasNext())
	  {
	   setOperation.add(it.next());
	  }
	   
	  return setOperation;
	 }
	  
	 /**
	  * 获得缓存的set
	 * @param <T>
	  * @param key
	  * @param operation
	  * @return
	  */
	 public <T> Set<T> getCacheSet(String key/*,BoundSetOperations<String,T> operation*/)
	 {
	  Set<T> dataSet = new HashSet<T>();
	  BoundSetOperations<String,T> operation = redisTemplate.boundSetOps(key); 
	   
	  Long size = operation.size();
	  for(int i = 0 ; i < size ; i++)
	  {
	   dataSet.add(operation.pop());
	  }
	  return dataSet;
	 }
	  
	 /**
	  * 缓存Map
	  * @param key
	  * @param dataMap
	  * @return
	  */
	 public <T> HashOperations<String,String,T> setCacheMap(String key,Map<String,T> dataMap)
	 {
	   
	  HashOperations hashOperations = redisTemplate.opsForHash();
	  if(null != dataMap)
	  {
	    
	   for (Map.Entry<String, T> entry : dataMap.entrySet()) { 
	      
	    /*System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); */
	    hashOperations.put(key,entry.getKey(),entry.getValue());
	   } 
	    
	  }
	   
	  return hashOperations;
	 }
	  
	 /**
	  * 获得缓存的Map
	  * @param key
	  * @param hashOperation
	  * @return
	  */
	 public <T> Map<String,T> getCacheMap(String key/*,HashOperations<String,String,T> hashOperation*/)
	 {
	  Map<String, T> map = redisTemplate.opsForHash().entries(key);
	  /*Map<String, T> map = hashOperation.entries(key);*/
	  return map;
	 }
	  
	 /**
		 * 打开JEDIS数据库连接
		 * 
		 * @param jedis
		 * @throws Exception
		 */
		public Map<String, Object> openJedis() throws Exception {
			Map<String, Object> result = null;
			if (null == jedisPool) {
				return null;
			}
			Jedis jedis = null;
			try {
				jedis = jedisPool.getResource();
				result = new HashMap<String, Object>();
				result.put("pool", jedisPool);
				result.put("jedis", jedis);
			} catch (Exception e) {
				returnBrokenJedis(jedisPool, jedis);
				logger.error(e.getMessage(), e);
				throw e;
			}
			return result;
		}
		
		/**
		 * 
		 * returnBrokenJedis:释放redis对象
		 * 
		 * @author wim
		 * @param p
		 * @param jedis
		 * @since 2016年4月5日
		 */
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void returnBrokenJedis(Pool p, Object jedis) {

			if (null != p && null != jedis) {
				try {
					// 释放redis对象
					p.returnBrokenResource(jedis);
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	 
	  
	 /**
		 * 设置key的过期时间，以秒为单位
		 * 
		 * @param String
		 *            key
		 * @param seconds
		 *            过期时间,已秒为单位
		 * @return 影响的记录数
		 * */
		@SuppressWarnings({ "rawtypes" })
		public long expired(String key, int seconds) {

			long count = 0;
			Pool pool = null;
			Jedis redis = null;
			try {
				Map<String, Object> openJedis = openJedis();
				if (null != openJedis) {
					pool = (Pool) openJedis.get("pool");
					redis = (Jedis) openJedis.get("jedis");
					count = redis.expire(key, seconds);
				}
			} catch (Exception e) {
				returnBrokenJedis(pool, redis);
				throw new RuntimeException(e);
			} finally {
				closeJedis(pool, redis);
			}
			return count;
		}

		/**
		 * 设置key的过期时间,它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00，格里高利历）的偏移量。
		 * 
		 * @param String
		 *            key
		 * @param 时间
		 *            ,已秒为单位
		 * @return 影响的记录数
		 * */
		@SuppressWarnings({ "rawtypes" })
		public long expireAt(String key, long timestamp) {

			long count = 0;
			Pool pool = null;
			Jedis jedis = null;
			try {
				Map<String, Object> openJedis = openJedis();
				if (null != openJedis) {
					pool = (Pool) openJedis.get("pool");
					jedis = (Jedis) openJedis.get("jedis");
					count = jedis.expireAt(key, timestamp);
				}
			} catch (Exception e) {
				returnBrokenJedis(pool, jedis);
				throw new RuntimeException(e);
			} finally {
				closeJedis(pool, jedis);
			}
			return count;
		}

		/**
		 * 查询key的过期时间
		 * 
		 * @param String
		 *            key
		 * @return 以秒为单位的时间表示
		 * */
		@SuppressWarnings({ "rawtypes" })
		public long ttl(String key) {
			long len = 0;

			Pool pool = null;
			Object redis = null;
			try {
				Map<String, Object> openRedis = openRedis();
				if (null != openRedis) {
					pool = (Pool) openRedis.get("pool");
					redis = openRedis.get("jedis");
					if (redis instanceof ShardedJedis) {
						len = ((ShardedJedis) redis).ttl(key);
					} else if (redis instanceof Jedis) {
						len = ((Jedis) redis).ttl(key);
					}
				}
			} catch (Exception e) {
				returnBrokenJedis(pool, redis);
				throw new RuntimeException(e);
			} finally {
				closeJedis(pool, redis);
			}
			return len;
		}

		/**
		 * 打开redis连接
		 * 
		 * @return
		 * @throws Exception
		 */
		private Map<String, Object> openRedis() throws Exception {
			if (null != shardedJedisPool) {
				return openShareJedis();
			} else if (null != jedisPool) {
				return openJedis();
			}
			return null;
		}
		
		/**
		 * 
		 * openShareJedis:打开JEDIS从数据库连接
		 * 
		 * @author wim
		 * @return
		 * @throws Exception
		 * @since 2016年4月5日
		 */
		public Map<String, Object> openShareJedis() throws Exception {
			Map<String, Object> result = null;
			if (null == shardedJedisPool) {
				return null;
			}
			ShardedJedis shardedJedis = null;
			try {
				shardedJedis = shardedJedisPool.getResource();
				result = new HashMap<String, Object>();
				result.put("pool", shardedJedisPool);
				result.put("jedis", shardedJedis);
			} catch (Exception e) {
				returnBrokenJedis(shardedJedisPool, shardedJedis);
				logger.error(e.getMessage(), e);
				throw e;
			}
			return result;
		}
		
		/**
		 * 取消对key过期时间的设置
		 * 
		 * @param key
		 * @return 影响的记录数
		 * */
		@SuppressWarnings({ "rawtypes" })
		public long persist(String key) {
			long count = 0;

			Pool pool = null;
			Jedis jedis = null;
			try {
				Map<String, Object> openJedis = openJedis();
				if (null != openJedis) {
					pool = (Pool) openJedis.get("pool");
					jedis = (Jedis) openJedis.get("jedis");
					count = jedis.persist(key);
				}
			} catch (Exception e) {
				returnBrokenJedis(pool, jedis);
				throw new RuntimeException(e);
			} finally {
				closeJedis(pool, jedis);
			}
			return count;
		}
	  
		/**
		 * 关闭JEDIS数据库连接(返回连接池)
		 * 
		 * @param jedis
		 */
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void closeJedis(Pool p, Object jedis) {
			if (null != p && null != jedis) {
				try {
					// 返回连接池
					p.returnResource(jedis);
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	  
	  
	 /**
	  * 缓存Map
	  * @param key
	  * @param dataMap
	  * @return
	  */
	 public <T> HashOperations<String,Integer,T> setCacheIntegerMap(String key,Map<Integer,T> dataMap)
	 {
	  HashOperations hashOperations = redisTemplate.opsForHash();
	  if(null != dataMap)
	  {
	    
	   for (Map.Entry<Integer, T> entry : dataMap.entrySet()) { 
	      
	    /*System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); */
	    hashOperations.put(key,entry.getKey(),entry.getValue());
	   } 
	    
	  }
	   
	  return hashOperations;
	 }
	  
	 /**
	  * 获得缓存的Map
	  * @param key
	  * @param hashOperation
	  * @return
	  */
	 public <T> Map<Integer,T> getCacheIntegerMap(String key/*,HashOperations<String,String,T> hashOperation*/)
	 {
	  Map<Integer, T> map = redisTemplate.opsForHash().entries(key);
	  /*Map<String, T> map = hashOperation.entries(key);*/
	  return map;
	 }
}
