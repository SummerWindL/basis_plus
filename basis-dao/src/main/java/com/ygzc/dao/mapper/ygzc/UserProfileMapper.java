package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.UserProfile;
import com.ygzc.dao.model.ygzc.UserProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProfileMapper {
    long countByExample(UserProfileExample example);

    int deleteByExample(UserProfileExample example);

    int deleteByPrimaryKey(String pid);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    List<UserProfile> selectByExample(UserProfileExample example);

    UserProfile selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByExample(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}