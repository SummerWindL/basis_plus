package com.ygzc.web.controller.echarts;

import com.ygzc.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：Echarts示例控制器<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/12 下午1:50<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */

@Controller
@RequestMapping("/echarts")
public class EChartsController extends BaseController {

    /**
     * 页面初始化
     *
     * @return String 页面地址
     */
    @RequestMapping("/init")
    public String init(){
        System.out.println("进入ECharts页面初始化方法");
        return "echarts/init";
    }

}
