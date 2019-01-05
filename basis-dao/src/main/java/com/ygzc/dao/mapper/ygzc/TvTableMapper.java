package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.TvTable;
import com.ygzc.dao.model.ygzc.TvTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TvTableMapper {
    long countByExample(TvTableExample example);

    int deleteByExample(TvTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TvTable record);

    int insertSelective(TvTable record);

    List<TvTable> selectByExample(TvTableExample example);

    TvTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TvTable record, @Param("example") TvTableExample example);

    int updateByExample(@Param("record") TvTable record, @Param("example") TvTableExample example);

    int updateByPrimaryKeySelective(TvTable record);

    int updateByPrimaryKey(TvTable record);
}