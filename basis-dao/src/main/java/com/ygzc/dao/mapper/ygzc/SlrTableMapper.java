package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.SlrTable;
import com.ygzc.dao.model.ygzc.SlrTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlrTableMapper {
    long countByExample(SlrTableExample example);

    int deleteByExample(SlrTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SlrTable record);

    int insertSelective(SlrTable record);

    List<SlrTable> selectByExample(SlrTableExample example);

    SlrTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SlrTable record, @Param("example") SlrTableExample example);

    int updateByExample(@Param("record") SlrTable record, @Param("example") SlrTableExample example);

    int updateByPrimaryKeySelective(SlrTable record);

    int updateByPrimaryKey(SlrTable record);
}