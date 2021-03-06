package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.District;
import com.ygzc.dao.model.ygzc.DistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper {
    long countByExample(DistrictExample example);

    int deleteByExample(DistrictExample example);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictExample example);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);
}