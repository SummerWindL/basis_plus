package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.OtherLogin;
import com.ygzc.dao.model.ygzc.OtherLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherLoginMapper {
    long countByExample(OtherLoginExample example);

    int deleteByExample(OtherLoginExample example);

    int insert(OtherLogin record);

    int insertSelective(OtherLogin record);

    List<OtherLogin> selectByExample(OtherLoginExample example);

    int updateByExampleSelective(@Param("record") OtherLogin record, @Param("example") OtherLoginExample example);

    int updateByExample(@Param("record") OtherLogin record, @Param("example") OtherLoginExample example);
}