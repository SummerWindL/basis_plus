package com.ygzc.service.user;

import com.ygzc.api.user.UserRoleRelService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.user.UserRoleRelMapper;
import com.ygzc.dao.model.user.UserRoleRel;
import com.ygzc.dao.model.user.UserRoleRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:56<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("userRoleRelService")
public class UserRoleRelServiceImpl extends BaseServiceImpl<UserRoleRelMapper, UserRoleRel, UserRoleRelExample> implements UserRoleRelService {

    @Autowired
    UserRoleRelMapper userRoleRelMapper;

}
