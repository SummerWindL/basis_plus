package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.UserTerminalGrade;
import com.ygzc.dao.model.ygzc.UserTerminalGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTerminalGradeMapper {
    long countByExample(UserTerminalGradeExample example);

    int deleteByExample(UserTerminalGradeExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserTerminalGrade record);

    int insertSelective(UserTerminalGrade record);

    List<UserTerminalGrade> selectByExample(UserTerminalGradeExample example);

    UserTerminalGrade selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserTerminalGrade record, @Param("example") UserTerminalGradeExample example);

    int updateByExample(@Param("record") UserTerminalGrade record, @Param("example") UserTerminalGradeExample example);

    int updateByPrimaryKeySelective(UserTerminalGrade record);

    int updateByPrimaryKey(UserTerminalGrade record);
}