package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ApplicationScene;
import com.ygzc.dao.model.ygzc.ApplicationSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationSceneMapper {
    long countByExample(ApplicationSceneExample example);

    int deleteByExample(ApplicationSceneExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationScene record);

    int insertSelective(ApplicationScene record);

    List<ApplicationScene> selectByExample(ApplicationSceneExample example);

    ApplicationScene selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationScene record, @Param("example") ApplicationSceneExample example);

    int updateByExample(@Param("record") ApplicationScene record, @Param("example") ApplicationSceneExample example);

    int updateByPrimaryKeySelective(ApplicationScene record);

    int updateByPrimaryKey(ApplicationScene record);
}