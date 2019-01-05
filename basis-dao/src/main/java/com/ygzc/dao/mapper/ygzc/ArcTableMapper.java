package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ArcTable;
import com.ygzc.dao.model.ygzc.ArcTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArcTableMapper {
    long countByExample(ArcTableExample example);

    int deleteByExample(ArcTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArcTable record);

    int insertSelective(ArcTable record);

    List<ArcTable> selectByExample(ArcTableExample example);

    ArcTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArcTable record, @Param("example") ArcTableExample example);

    int updateByExample(@Param("record") ArcTable record, @Param("example") ArcTableExample example);

    int updateByPrimaryKeySelective(ArcTable record);

    int updateByPrimaryKey(ArcTable record);
}