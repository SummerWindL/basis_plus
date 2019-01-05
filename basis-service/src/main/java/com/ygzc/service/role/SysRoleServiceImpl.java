package com.ygzc.service.role;

import com.ygzc.api.role.SysRoleService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.role.SysRoleMapper;
import com.ygzc.dao.model.role.SysRole;
import com.ygzc.dao.model.role.SysRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:54<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleMapper, SysRole, SysRoleExample> implements SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

}
