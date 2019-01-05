package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.IntelligentHardware;
import com.ygzc.dao.model.ygzc.IntelligentHardwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntelligentHardwareMapper {
    long countByExample(IntelligentHardwareExample example);

    int deleteByExample(IntelligentHardwareExample example);

    int deleteByPrimaryKey(String id);

    int insert(IntelligentHardware record);

    int insertSelective(IntelligentHardware record);

    List<IntelligentHardware> selectByExample(IntelligentHardwareExample example);

    IntelligentHardware selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IntelligentHardware record, @Param("example") IntelligentHardwareExample example);

    int updateByExample(@Param("record") IntelligentHardware record, @Param("example") IntelligentHardwareExample example);

    int updateByPrimaryKeySelective(IntelligentHardware record);

    int updateByPrimaryKey(IntelligentHardware record);
}