package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.SceneTimer;
import com.ygzc.dao.model.ygzc.SceneTimerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneTimerMapper {
    long countByExample(SceneTimerExample example);

    int deleteByExample(SceneTimerExample example);

    int deleteByPrimaryKey(String id);

    int insert(SceneTimer record);

    int insertSelective(SceneTimer record);

    List<SceneTimer> selectByExample(SceneTimerExample example);

    SceneTimer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SceneTimer record, @Param("example") SceneTimerExample example);

    int updateByExample(@Param("record") SceneTimer record, @Param("example") SceneTimerExample example);

    int updateByPrimaryKeySelective(SceneTimer record);

    int updateByPrimaryKey(SceneTimer record);
}