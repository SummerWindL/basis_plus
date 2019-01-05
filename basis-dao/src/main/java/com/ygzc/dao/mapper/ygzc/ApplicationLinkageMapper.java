package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ApplicationLinkage;
import com.ygzc.dao.model.ygzc.ApplicationLinkageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationLinkageMapper {
    long countByExample(ApplicationLinkageExample example);

    int deleteByExample(ApplicationLinkageExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationLinkage record);

    int insertSelective(ApplicationLinkage record);

    List<ApplicationLinkage> selectByExample(ApplicationLinkageExample example);

    ApplicationLinkage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationLinkage record, @Param("example") ApplicationLinkageExample example);

    int updateByExample(@Param("record") ApplicationLinkage record, @Param("example") ApplicationLinkageExample example);

    int updateByPrimaryKeySelective(ApplicationLinkage record);

    int updateByPrimaryKey(ApplicationLinkage record);
}