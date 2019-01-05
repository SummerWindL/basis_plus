package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.UserApplication;
import com.ygzc.dao.model.ygzc.UserApplicationExample;
import com.ygzc.dao.model.ygzc.UserApplicationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserApplicationMapper {
    long countByExample(UserApplicationExample example);

    int deleteByExample(UserApplicationExample example);

    int deleteByPrimaryKey(UserApplicationKey key);

    int insert(UserApplication record);

    int insertSelective(UserApplication record);

    List<UserApplication> selectByExample(UserApplicationExample example);

    UserApplication selectByPrimaryKey(UserApplicationKey key);

    int updateByExampleSelective(@Param("record") UserApplication record, @Param("example") UserApplicationExample example);

    int updateByExample(@Param("record") UserApplication record, @Param("example") UserApplicationExample example);

    int updateByPrimaryKeySelective(UserApplication record);

    int updateByPrimaryKey(UserApplication record);
}