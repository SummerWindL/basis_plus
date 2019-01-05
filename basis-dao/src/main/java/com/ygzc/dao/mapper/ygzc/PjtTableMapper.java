package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.PjtTable;
import com.ygzc.dao.model.ygzc.PjtTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PjtTableMapper {
    long countByExample(PjtTableExample example);

    int deleteByExample(PjtTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PjtTable record);

    int insertSelective(PjtTable record);

    List<PjtTable> selectByExample(PjtTableExample example);

    PjtTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PjtTable record, @Param("example") PjtTableExample example);

    int updateByExample(@Param("record") PjtTable record, @Param("example") PjtTableExample example);

    int updateByPrimaryKeySelective(PjtTable record);

    int updateByPrimaryKey(PjtTable record);
}