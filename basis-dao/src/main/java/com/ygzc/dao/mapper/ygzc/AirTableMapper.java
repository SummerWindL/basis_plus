package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.AirTable;
import com.ygzc.dao.model.ygzc.AirTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirTableMapper {
    long countByExample(AirTableExample example);

    int deleteByExample(AirTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AirTable record);

    int insertSelective(AirTable record);

    List<AirTable> selectByExample(AirTableExample example);

    AirTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AirTable record, @Param("example") AirTableExample example);

    int updateByExample(@Param("record") AirTable record, @Param("example") AirTableExample example);

    int updateByPrimaryKeySelective(AirTable record);

    int updateByPrimaryKey(AirTable record);
}