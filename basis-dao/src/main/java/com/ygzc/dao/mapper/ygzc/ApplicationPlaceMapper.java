package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ApplicationPlace;
import com.ygzc.dao.model.ygzc.ApplicationPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationPlaceMapper {
    long countByExample(ApplicationPlaceExample example);

    int deleteByExample(ApplicationPlaceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationPlace record);

    int insertSelective(ApplicationPlace record);

    List<ApplicationPlace> selectByExample(ApplicationPlaceExample example);

    ApplicationPlace selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationPlace record, @Param("example") ApplicationPlaceExample example);

    int updateByExample(@Param("record") ApplicationPlace record, @Param("example") ApplicationPlaceExample example);

    int updateByPrimaryKeySelective(ApplicationPlace record);

    int updateByPrimaryKey(ApplicationPlace record);
}