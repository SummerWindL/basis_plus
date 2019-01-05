package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.TempRf;
import com.ygzc.dao.model.ygzc.TempRfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempRfMapper {
    long countByExample(TempRfExample example);

    int deleteByExample(TempRfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TempRf record);

    int insertSelective(TempRf record);

    List<TempRf> selectByExample(TempRfExample example);

    TempRf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TempRf record, @Param("example") TempRfExample example);

    int updateByExample(@Param("record") TempRf record, @Param("example") TempRfExample example);

    int updateByPrimaryKeySelective(TempRf record);

    int updateByPrimaryKey(TempRf record);
}