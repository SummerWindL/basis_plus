package com.ygzc.dao.mapper.role;

import com.ygzc.dao.model.role.RoleMenuRel;
import com.ygzc.dao.model.role.RoleMenuRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    long countByExample(RoleMenuRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int deleteByExample(RoleMenuRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int deleteByPrimaryKey(String relId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int insert(RoleMenuRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int insertSelective(RoleMenuRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    List<RoleMenuRel> selectByExample(RoleMenuRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    RoleMenuRel selectByPrimaryKey(String relId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") RoleMenuRel record, @Param("example") RoleMenuRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int updateByExample(@Param("record") RoleMenuRel record, @Param("example") RoleMenuRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int updateByPrimaryKeySelective(RoleMenuRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROLE_MENU_REL
     *
     * @mbg.generated Wed Feb 07 16:03:39 CST 2018
     */
    int updateByPrimaryKey(RoleMenuRel record);
}