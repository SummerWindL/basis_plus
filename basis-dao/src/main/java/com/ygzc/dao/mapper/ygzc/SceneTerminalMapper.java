package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.SceneTerminal;
import com.ygzc.dao.model.ygzc.SceneTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneTerminalMapper {
    long countByExample(SceneTerminalExample example);

    int deleteByExample(SceneTerminalExample example);

    int deleteByPrimaryKey(String id);

    int insert(SceneTerminal record);

    int insertSelective(SceneTerminal record);

    List<SceneTerminal> selectByExample(SceneTerminalExample example);

    SceneTerminal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SceneTerminal record, @Param("example") SceneTerminalExample example);

    int updateByExample(@Param("record") SceneTerminal record, @Param("example") SceneTerminalExample example);

    int updateByPrimaryKeySelective(SceneTerminal record);

    int updateByPrimaryKey(SceneTerminal record);
}