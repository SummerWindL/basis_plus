package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.LinkageTerminal;
import com.ygzc.dao.model.ygzc.LinkageTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkageTerminalMapper {
    long countByExample(LinkageTerminalExample example);

    int deleteByExample(LinkageTerminalExample example);

    int deleteByPrimaryKey(String id);

    int insert(LinkageTerminal record);

    int insertSelective(LinkageTerminal record);

    List<LinkageTerminal> selectByExample(LinkageTerminalExample example);

    LinkageTerminal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LinkageTerminal record, @Param("example") LinkageTerminalExample example);

    int updateByExample(@Param("record") LinkageTerminal record, @Param("example") LinkageTerminalExample example);

    int updateByPrimaryKeySelective(LinkageTerminal record);

    int updateByPrimaryKey(LinkageTerminal record);
}