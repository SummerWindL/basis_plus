package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.HardSeries;
import com.ygzc.dao.model.ygzc.HardSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardSeriesMapper {
    long countByExample(HardSeriesExample example);

    int deleteByExample(HardSeriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HardSeries record);

    int insertSelective(HardSeries record);

    List<HardSeries> selectByExample(HardSeriesExample example);

    HardSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HardSeries record, @Param("example") HardSeriesExample example);

    int updateByExample(@Param("record") HardSeries record, @Param("example") HardSeriesExample example);

    int updateByPrimaryKeySelective(HardSeries record);

    int updateByPrimaryKey(HardSeries record);
}