package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.SceneTimerList;
import com.ygzc.dao.model.ygzc.SceneTimerListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneTimerListMapper {
    long countByExample(SceneTimerListExample example);

    int deleteByExample(SceneTimerListExample example);

    int deleteByPrimaryKey(String id);

    int insert(SceneTimerList record);

    int insertSelective(SceneTimerList record);

    List<SceneTimerList> selectByExample(SceneTimerListExample example);

    SceneTimerList selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SceneTimerList record, @Param("example") SceneTimerListExample example);

    int updateByExample(@Param("record") SceneTimerList record, @Param("example") SceneTimerListExample example);

    int updateByPrimaryKeySelective(SceneTimerList record);

    int updateByPrimaryKey(SceneTimerList record);
}