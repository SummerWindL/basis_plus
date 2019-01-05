package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.HardType;
import com.ygzc.dao.model.ygzc.HardTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardTypeMapper {
    long countByExample(HardTypeExample example);

    int deleteByExample(HardTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HardType record);

    int insertSelective(HardType record);

    List<HardType> selectByExample(HardTypeExample example);

    HardType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HardType record, @Param("example") HardTypeExample example);

    int updateByExample(@Param("record") HardType record, @Param("example") HardTypeExample example);

    int updateByPrimaryKeySelective(HardType record);

    int updateByPrimaryKey(HardType record);
}