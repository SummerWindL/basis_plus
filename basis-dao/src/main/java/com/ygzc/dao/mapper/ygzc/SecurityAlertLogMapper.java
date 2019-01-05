package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.SecurityAlertLog;
import com.ygzc.dao.model.ygzc.SecurityAlertLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityAlertLogMapper {
    long countByExample(SecurityAlertLogExample example);

    int deleteByExample(SecurityAlertLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecurityAlertLog record);

    int insertSelective(SecurityAlertLog record);

    List<SecurityAlertLog> selectByExample(SecurityAlertLogExample example);

    SecurityAlertLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecurityAlertLog record, @Param("example") SecurityAlertLogExample example);

    int updateByExample(@Param("record") SecurityAlertLog record, @Param("example") SecurityAlertLogExample example);

    int updateByPrimaryKeySelective(SecurityAlertLog record);

    int updateByPrimaryKey(SecurityAlertLog record);
}