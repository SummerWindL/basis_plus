package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.AreaIcon;
import com.ygzc.dao.model.ygzc.AreaIconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaIconMapper {
    long countByExample(AreaIconExample example);

    int deleteByExample(AreaIconExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaIcon record);

    int insertSelective(AreaIcon record);

    List<AreaIcon> selectByExample(AreaIconExample example);

    AreaIcon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaIcon record, @Param("example") AreaIconExample example);

    int updateByExample(@Param("record") AreaIcon record, @Param("example") AreaIconExample example);

    int updateByPrimaryKeySelective(AreaIcon record);

    int updateByPrimaryKey(AreaIcon record);
}