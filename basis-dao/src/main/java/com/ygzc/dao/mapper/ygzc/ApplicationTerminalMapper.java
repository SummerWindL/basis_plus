package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ApplicationTerminal;
import com.ygzc.dao.model.ygzc.ApplicationTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationTerminalMapper {
    long countByExample(ApplicationTerminalExample example);

    int deleteByExample(ApplicationTerminalExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationTerminal record);

    int insertSelective(ApplicationTerminal record);

    List<ApplicationTerminal> selectByExample(ApplicationTerminalExample example);

    ApplicationTerminal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationTerminal record, @Param("example") ApplicationTerminalExample example);

    int updateByExample(@Param("record") ApplicationTerminal record, @Param("example") ApplicationTerminalExample example);

    int updateByPrimaryKeySelective(ApplicationTerminal record);

    int updateByPrimaryKey(ApplicationTerminal record);
}