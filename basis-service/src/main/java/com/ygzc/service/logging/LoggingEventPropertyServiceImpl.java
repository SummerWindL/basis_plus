package com.ygzc.service.logging;

import com.ygzc.api.logging.LoggingEventPropertyService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.logging.LoggingEventPropertyMapper;
import com.ygzc.dao.model.logging.LoggingEventProperty;
import com.ygzc.dao.model.logging.LoggingEventPropertyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:46<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("loggingEventPropertyService")
public class LoggingEventPropertyServiceImpl extends BaseServiceImpl<LoggingEventPropertyMapper, LoggingEventProperty, LoggingEventPropertyExample> implements LoggingEventPropertyService {

    @Autowired
    LoggingEventPropertyMapper loggingEventPropertyMapper;
}
