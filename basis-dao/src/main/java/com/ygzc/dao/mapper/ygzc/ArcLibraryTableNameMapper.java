package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.ArcLibraryTableName;
import com.ygzc.dao.model.ygzc.ArcLibraryTableNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArcLibraryTableNameMapper {
    long countByExample(ArcLibraryTableNameExample example);

    int deleteByExample(ArcLibraryTableNameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArcLibraryTableName record);

    int insertSelective(ArcLibraryTableName record);

    List<ArcLibraryTableName> selectByExample(ArcLibraryTableNameExample example);

    ArcLibraryTableName selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArcLibraryTableName record, @Param("example") ArcLibraryTableNameExample example);

    int updateByExample(@Param("record") ArcLibraryTableName record, @Param("example") ArcLibraryTableNameExample example);

    int updateByPrimaryKeySelective(ArcLibraryTableName record);

    int updateByPrimaryKey(ArcLibraryTableName record);
}