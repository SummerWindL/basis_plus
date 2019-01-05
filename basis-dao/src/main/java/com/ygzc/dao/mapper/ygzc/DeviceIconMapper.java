package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.DeviceIcon;
import com.ygzc.dao.model.ygzc.DeviceIconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceIconMapper {
    long countByExample(DeviceIconExample example);

    int deleteByExample(DeviceIconExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceIcon record);

    int insertSelective(DeviceIcon record);

    List<DeviceIcon> selectByExample(DeviceIconExample example);

    DeviceIcon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceIcon record, @Param("example") DeviceIconExample example);

    int updateByExample(@Param("record") DeviceIcon record, @Param("example") DeviceIconExample example);

    int updateByPrimaryKeySelective(DeviceIcon record);

    int updateByPrimaryKey(DeviceIcon record);
}