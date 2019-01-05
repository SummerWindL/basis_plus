package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.TvboxTable;
import com.ygzc.dao.model.ygzc.TvboxTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TvboxTableMapper {
    long countByExample(TvboxTableExample example);

    int deleteByExample(TvboxTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TvboxTable record);

    int insertSelective(TvboxTable record);

    List<TvboxTable> selectByExample(TvboxTableExample example);

    TvboxTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TvboxTable record, @Param("example") TvboxTableExample example);

    int updateByExample(@Param("record") TvboxTable record, @Param("example") TvboxTableExample example);

    int updateByPrimaryKeySelective(TvboxTable record);

    int updateByPrimaryKey(TvboxTable record);
}