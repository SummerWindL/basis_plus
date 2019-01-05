package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.Camera;
import com.ygzc.dao.model.ygzc.CameraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CameraMapper {
    long countByExample(CameraExample example);

    int deleteByExample(CameraExample example);

    int deleteByPrimaryKey(String id);

    int insert(Camera record);

    int insertSelective(Camera record);

    List<Camera> selectByExample(CameraExample example);

    Camera selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Camera record, @Param("example") CameraExample example);

    int updateByExample(@Param("record") Camera record, @Param("example") CameraExample example);

    int updateByPrimaryKeySelective(Camera record);

    int updateByPrimaryKey(Camera record);
}