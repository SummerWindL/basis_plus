package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ArcCode;
import com.ygzc.dao.model.ygzc.ArcCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArcCodeMapper {
    long countByExample(ArcCodeExample example);

    int deleteByExample(ArcCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArcCode record);

    int insertSelective(ArcCode record);

    List<ArcCode> selectByExample(ArcCodeExample example);

    ArcCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArcCode record, @Param("example") ArcCodeExample example);

    int updateByExample(@Param("record") ArcCode record, @Param("example") ArcCodeExample example);

    int updateByPrimaryKeySelective(ArcCode record);

    int updateByPrimaryKey(ArcCode record);
}