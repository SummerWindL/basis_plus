package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.UserPlace;
import com.ygzc.dao.model.ygzc.UserPlaceExample;
import com.ygzc.dao.model.ygzc.UserPlaceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPlaceMapper {
    long countByExample(UserPlaceExample example);

    int deleteByExample(UserPlaceExample example);

    int deleteByPrimaryKey(UserPlaceKey key);

    int insert(UserPlace record);

    int insertSelective(UserPlace record);

    List<UserPlace> selectByExample(UserPlaceExample example);

    UserPlace selectByPrimaryKey(UserPlaceKey key);

    int updateByExampleSelective(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByExample(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByPrimaryKeySelective(UserPlace record);

    int updateByPrimaryKey(UserPlace record);
}