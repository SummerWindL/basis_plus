package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ArcMatchTable;
import com.ygzc.dao.model.ygzc.ArcMatchTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArcMatchTableMapper {
    long countByExample(ArcMatchTableExample example);

    int deleteByExample(ArcMatchTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArcMatchTable record);

    int insertSelective(ArcMatchTable record);

    List<ArcMatchTable> selectByExample(ArcMatchTableExample example);

    ArcMatchTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArcMatchTable record, @Param("example") ArcMatchTableExample example);

    int updateByExample(@Param("record") ArcMatchTable record, @Param("example") ArcMatchTableExample example);

    int updateByPrimaryKeySelective(ArcMatchTable record);

    int updateByPrimaryKey(ArcMatchTable record);
}