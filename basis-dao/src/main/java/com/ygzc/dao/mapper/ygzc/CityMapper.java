package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.City;
import com.ygzc.dao.model.ygzc.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);
}