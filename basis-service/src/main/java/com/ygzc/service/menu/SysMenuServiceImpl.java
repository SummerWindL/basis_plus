package com.ygzc.service.menu;

import com.ygzc.api.menu.SysMenuService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.menu.SysMenuMapper;
import com.ygzc.dao.model.menu.SysMenu;
import com.ygzc.dao.model.menu.SysMenuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:48<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuMapper, SysMenu, SysMenuExample> implements SysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;
}
