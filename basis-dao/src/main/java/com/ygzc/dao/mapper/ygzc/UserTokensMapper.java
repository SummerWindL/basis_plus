package com.ygzc.dao.mapper.ygzc;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ygzc.dao.model.ygzc.UserTokens;
import com.ygzc.dao.model.ygzc.UserTokensExample;

public interface UserTokensMapper {
    long countByExample(UserTokensExample example);

    int deleteByExample(UserTokensExample example);

    int insert(UserTokens record);

    int insertSelective(UserTokens record);
    
    List<UserTokens> selectByExample(UserTokensExample example);

    int updateByExampleSelective(@Param("record") UserTokens record, @Param("example") UserTokensExample example);

    int updateByExample(@Param("record") UserTokens record, @Param("example") UserTokensExample example);
    
    /**
     * 清空token值
     * @param uid
     */
    public void emptyToken(String uid);
    
    /**
     * 获取用户token
     * @param uid 用户id
     * @return
     */
    public UserTokens selectByUid(String uid);
}