package com.ygzc.web.controller.product;

import com.ygzc.api.product.TbProductService;
import com.ygzc.common.constant.DataSourceName;
import com.ygzc.common.model.PageModel;
import com.ygzc.core.controller.BaseController;
import com.ygzc.dao.model.product.TbProduct;
import com.ygzc.dao.model.product.TbProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 名称：roductController<br>
 * <p>
 * 描述：产品信息管理<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2017-09-06 09:13:00<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Controller
@RequestMapping("/demo/product")
public class ProductController extends BaseController {

    @Autowired
    private TbProductService tbProductService;

    @RequestMapping("/init")
    public String init() {
        return "demo/product/init";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<TbProduct> list(Integer offset, int limit, String search, String sort, String order) {
        TbProductExample example = new TbProductExample();
        PageModel<TbProduct> pageModel = tbProductService.selectByExampleForOffsetPage(example, offset, limit);
        return pageModel;
    }

}
