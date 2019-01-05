package com.ygzc.service.role;

import com.ygzc.api.role.RoleMenuRelService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.role.RoleMenuRelMapper;
import com.ygzc.dao.model.role.RoleMenuRel;
import com.ygzc.dao.model.role.RoleMenuRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:53<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("roleMenuRelService")
public class RoleMenuRelServiceImpl extends BaseServiceImpl<RoleMenuRelMapper, RoleMenuRel, RoleMenuRelExample> implements RoleMenuRelService {

    @Autowired
    RoleMenuRelMapper roleMenuRelMapper;

}
