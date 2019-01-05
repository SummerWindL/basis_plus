package com.ygzc.dao.mapper.ygzc;

import com.ygzc.dao.model.ygzc.Character;
import com.ygzc.dao.model.ygzc.CharacterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterMapper {
    long countByExample(CharacterExample example);

    int deleteByExample(CharacterExample example);

    int deleteByPrimaryKey(Integer charId);

    int insert(Character record);

    int insertSelective(Character record);

    List<Character> selectByExample(CharacterExample example);

    Character selectByPrimaryKey(Integer charId);

    int updateByExampleSelective(@Param("record") Character record, @Param("example") CharacterExample example);

    int updateByExample(@Param("record") Character record, @Param("example") CharacterExample example);

    int updateByPrimaryKeySelective(Character record);

    int updateByPrimaryKey(Character record);
}