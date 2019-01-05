package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.FanTable;
import com.ygzc.dao.model.ygzc.FanTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FanTableMapper {
    long countByExample(FanTableExample example);

    int deleteByExample(FanTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FanTable record);

    int insertSelective(FanTable record);

    List<FanTable> selectByExample(FanTableExample example);

    FanTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FanTable record, @Param("example") FanTableExample example);

    int updateByExample(@Param("record") FanTable record, @Param("example") FanTableExample example);

    int updateByPrimaryKeySelective(FanTable record);

    int updateByPrimaryKey(FanTable record);
}