package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.DeploymentAlarmLog;
import com.ygzc.dao.model.ygzc.DeploymentAlarmLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeploymentAlarmLogMapper {
    long countByExample(DeploymentAlarmLogExample example);

    int deleteByExample(DeploymentAlarmLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeploymentAlarmLog record);

    int insertSelective(DeploymentAlarmLog record);

    List<DeploymentAlarmLog> selectByExample(DeploymentAlarmLogExample example);

    DeploymentAlarmLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeploymentAlarmLog record, @Param("example") DeploymentAlarmLogExample example);

    int updateByExample(@Param("record") DeploymentAlarmLog record, @Param("example") DeploymentAlarmLogExample example);

    int updateByPrimaryKeySelective(DeploymentAlarmLog record);

    int updateByPrimaryKey(DeploymentAlarmLog record);
}