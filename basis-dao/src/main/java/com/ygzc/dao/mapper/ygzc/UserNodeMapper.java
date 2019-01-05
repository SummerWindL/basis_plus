package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.UserNode;
import com.ygzc.dao.model.ygzc.UserNodeExample;
import com.ygzc.dao.model.ygzc.UserNodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserNodeMapper {
    long countByExample(UserNodeExample example);

    int deleteByExample(UserNodeExample example);

    int deleteByPrimaryKey(UserNodeKey key);

    int insert(UserNode record);

    int insertSelective(UserNode record);

    List<UserNode> selectByExample(UserNodeExample example);

    UserNode selectByPrimaryKey(UserNodeKey key);

    int updateByExampleSelective(@Param("record") UserNode record, @Param("example") UserNodeExample example);

    int updateByExample(@Param("record") UserNode record, @Param("example") UserNodeExample example);

    int updateByPrimaryKeySelective(UserNode record);

    int updateByPrimaryKey(UserNode record);
}