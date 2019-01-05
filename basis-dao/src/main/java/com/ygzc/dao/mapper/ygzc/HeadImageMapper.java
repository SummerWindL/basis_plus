package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.HeadImage;
import com.ygzc.dao.model.ygzc.HeadImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeadImageMapper {
    long countByExample(HeadImageExample example);

    int deleteByExample(HeadImageExample example);

    int deleteByPrimaryKey(String imageId);

    int insert(HeadImage record);

    int insertSelective(HeadImage record);

    List<HeadImage> selectByExample(HeadImageExample example);

    HeadImage selectByPrimaryKey(String imageId);

    int updateByExampleSelective(@Param("record") HeadImage record, @Param("example") HeadImageExample example);

    int updateByExample(@Param("record") HeadImage record, @Param("example") HeadImageExample example);

    int updateByPrimaryKeySelective(HeadImage record);

    int updateByPrimaryKey(HeadImage record);
}