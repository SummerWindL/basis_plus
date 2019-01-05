package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.IptvTable;
import com.ygzc.dao.model.ygzc.IptvTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IptvTableMapper {
    long countByExample(IptvTableExample example);

    int deleteByExample(IptvTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IptvTable record);

    int insertSelective(IptvTable record);

    List<IptvTable> selectByExample(IptvTableExample example);

    IptvTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IptvTable record, @Param("example") IptvTableExample example);

    int updateByExample(@Param("record") IptvTable record, @Param("example") IptvTableExample example);

    int updateByPrimaryKeySelective(IptvTable record);

    int updateByPrimaryKey(IptvTable record);
}