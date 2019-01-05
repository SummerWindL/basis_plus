package com.ygzc.service.user;

import com.ygzc.api.user.SysUserService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.user.SysUserMapper;
import com.ygzc.dao.model.user.SysUser;
import com.ygzc.dao.model.user.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/24 上午11:36<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, SysUser, SysUserExample> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

}
