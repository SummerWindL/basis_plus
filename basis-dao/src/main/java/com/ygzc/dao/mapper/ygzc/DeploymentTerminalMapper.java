package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.DeploymentTerminal;
import com.ygzc.dao.model.ygzc.DeploymentTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeploymentTerminalMapper {
    long countByExample(DeploymentTerminalExample example);

    int deleteByExample(DeploymentTerminalExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeploymentTerminal record);

    int insertSelective(DeploymentTerminal record);

    List<DeploymentTerminal> selectByExample(DeploymentTerminalExample example);

    DeploymentTerminal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeploymentTerminal record, @Param("example") DeploymentTerminalExample example);

    int updateByExample(@Param("record") DeploymentTerminal record, @Param("example") DeploymentTerminalExample example);

    int updateByPrimaryKeySelective(DeploymentTerminal record);

    int updateByPrimaryKey(DeploymentTerminal record);
}