package com.ygzc.service.product;

import com.ygzc.api.product.TbProductService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.common.spring.DataSourceContextHolder;
import com.ygzc.dao.mapper.product.TbProductMapper;
import com.ygzc.dao.model.product.TbProduct;
import com.ygzc.dao.model.product.TbProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:51<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("tbProductService")
public class TbProductServiceImpl extends BaseServiceImpl<TbProductMapper, TbProduct, TbProductExample> implements TbProductService {

    @Autowired
    TbProductMapper tbProductMapper;

}
