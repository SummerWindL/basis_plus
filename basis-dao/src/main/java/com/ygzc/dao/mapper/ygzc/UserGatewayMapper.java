package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.UserGateway;
import com.ygzc.dao.model.ygzc.UserGatewayExample;
import com.ygzc.dao.model.ygzc.UserGatewayKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGatewayMapper {
    long countByExample(UserGatewayExample example);

    int deleteByExample(UserGatewayExample example);

    int deleteByPrimaryKey(UserGatewayKey key);

    int insert(UserGateway record);

    int insertSelective(UserGateway record);

    List<UserGateway> selectByExample(UserGatewayExample example);

    UserGateway selectByPrimaryKey(UserGatewayKey key);

    int updateByExampleSelective(@Param("record") UserGateway record, @Param("example") UserGatewayExample example);

    int updateByExample(@Param("record") UserGateway record, @Param("example") UserGatewayExample example);

    int updateByPrimaryKeySelective(UserGateway record);

    int updateByPrimaryKey(UserGateway record);
}