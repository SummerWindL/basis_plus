package com.ygzc.web.controller.demo;

import com.ygzc.api.demo.DemoService;
import com.ygzc.api.jms.JmsSenderService;
import com.ygzc.api.persistence.DelegateService;
import com.ygzc.core.bean.Result;
import com.ygzc.core.controller.BaseController;

/*import com.yan.api.persistence.DelegateService;
import com.yan.api.product.TbProductService;
import com.yan.api.user.SysUserService;
import com.yan.common.model.PageModel;
import com.yan.core.controller.BaseController;
import com.yan.dao.model.product.TbProduct;
import com.yan.dao.model.product.TbProductExample;
import com.yan.dao.model.user.SysUser;
import com.yan.dao.model.user.SysUserExample;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述：Dubbo RPC 测试类<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018-01-18 09:47:39<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

    /**
     * 获取 demoService 对象
     */
    @Autowired
    private DemoService demoService;

    /**
     * 获取 delegateService 对象
     */
    @Autowired
    private DelegateService delegateService;

    /**
     * 获取 jmsService 对象
     */
    @Autowired
    private JmsSenderService jmsSenderService;

    /**
     * 获取自定义对象 service 服务
     */
    /*@Autowired
    private SysUserService sysUserService;
    @Autowired
    private TbProductService tbProductService;*/


    /**
     * 调用服务端 dubbo 测试 helloWorld 方法
     *
     * @param name
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(String name) {
        String msg = demoService.sayHello(name);
        return msg;
    }

    /**
     * 执行 example 查询、自定义 sqlMap 查询
     *
     * @return
     */
    /*@RequestMapping("/test1")
    @ResponseBody
    public List<SysUser> test1() {

        TbProductExample productExample = new TbProductExample();
        List<TbProduct> list1 = tbProductService.selectByExample(productExample);

        SysUserExample example = new SysUserExample();
        List<SysUser> list2 = sysUserService.selectByExample(example);

        List<SysUser> list3 = delegateService.selectList("com.yan.junit.JunitMapper.getSysUser");

        List<TbProduct> list4 = delegateService.selectList("com.yan.junit.JunitMapper.getTbProduct");

        return list2;
    }

    *//**
     * 自定义sql分页查询方法
     *
     * @return
     *//*
    @RequestMapping("/test2")
    @ResponseBody
    public PageModel<SysUser> test2() {
        PageModel<SysUser> pageModel = delegateService.selectPagination("com.yan.junit.JunitMapper.getSysUser", 1, 2);
        return pageModel;
    }

    *//**
     * 对象service分页查询
     *
     * @return
     *//*
    @RequestMapping("/test4")
    @ResponseBody
    public PageModel<SysUser> test4() {
        SysUserExample example = new SysUserExample();
        sysUserService.selectByExampleForStartPage(example, 1, 2);
        PageModel<SysUser> pageModel = sysUserService.selectByExampleForOffsetPage(example, 1, 2);
        return pageModel;
    }*/

    /**
     * 消息队列测试发送消息方法
     *
     * @return
     */
    @GetMapping(value="/test0")
    @ResponseBody
    public String test0() {
        jmsSenderService.sendQueue("ygzc.queue", "123456789-ygzc.queue");
        return "Jms消息服务发送完毕..."/*Result.success("Jms消息服务发送完毕...")*/;
    }


}
