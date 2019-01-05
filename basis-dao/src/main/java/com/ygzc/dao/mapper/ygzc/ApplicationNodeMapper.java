package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ApplicationNode;
import com.ygzc.dao.model.ygzc.ApplicationNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationNodeMapper {
    long countByExample(ApplicationNodeExample example);

    int deleteByExample(ApplicationNodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationNode record);

    int insertSelective(ApplicationNode record);

    List<ApplicationNode> selectByExample(ApplicationNodeExample example);

    ApplicationNode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationNode record, @Param("example") ApplicationNodeExample example);

    int updateByExample(@Param("record") ApplicationNode record, @Param("example") ApplicationNodeExample example);

    int updateByPrimaryKeySelective(ApplicationNode record);

    int updateByPrimaryKey(ApplicationNode record);
}