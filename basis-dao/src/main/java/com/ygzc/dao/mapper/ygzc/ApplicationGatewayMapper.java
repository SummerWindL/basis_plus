package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ApplicationGateway;
import com.ygzc.dao.model.ygzc.ApplicationGatewayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationGatewayMapper {
    long countByExample(ApplicationGatewayExample example);

    int deleteByExample(ApplicationGatewayExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationGateway record);

    int insertSelective(ApplicationGateway record);

    List<ApplicationGateway> selectByExample(ApplicationGatewayExample example);

    ApplicationGateway selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationGateway record, @Param("example") ApplicationGatewayExample example);

    int updateByExample(@Param("record") ApplicationGateway record, @Param("example") ApplicationGatewayExample example);

    int updateByPrimaryKeySelective(ApplicationGateway record);

    int updateByPrimaryKey(ApplicationGateway record);
}