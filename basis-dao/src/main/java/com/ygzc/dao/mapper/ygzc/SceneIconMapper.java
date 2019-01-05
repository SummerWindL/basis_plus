package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.SceneIcon;
import com.ygzc.dao.model.ygzc.SceneIconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneIconMapper {
    long countByExample(SceneIconExample example);

    int deleteByExample(SceneIconExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SceneIcon record);

    int insertSelective(SceneIcon record);

    List<SceneIcon> selectByExample(SceneIconExample example);

    SceneIcon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SceneIcon record, @Param("example") SceneIconExample example);

    int updateByExample(@Param("record") SceneIcon record, @Param("example") SceneIconExample example);

    int updateByPrimaryKeySelective(SceneIcon record);

    int updateByPrimaryKey(SceneIcon record);
}