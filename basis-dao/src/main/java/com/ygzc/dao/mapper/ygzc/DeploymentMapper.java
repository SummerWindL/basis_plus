package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.Deployment;
import com.ygzc.dao.model.ygzc.DeploymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeploymentMapper {
    long countByExample(DeploymentExample example);

    int deleteByExample(DeploymentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Deployment record);

    int insertSelective(Deployment record);

    List<Deployment> selectByExample(DeploymentExample example);

    Deployment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Deployment record, @Param("example") DeploymentExample example);

    int updateByExample(@Param("record") Deployment record, @Param("example") DeploymentExample example);

    int updateByPrimaryKeySelective(Deployment record);

    int updateByPrimaryKey(Deployment record);
}