package com.ygzc.service.logging;

import com.ygzc.api.logging.LoggingEventExceptionService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.logging.LoggingEventExceptionMapper;
import com.ygzc.dao.model.logging.LoggingEventException;
import com.ygzc.dao.model.logging.LoggingEventExceptionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:42<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("loggingEventExceptionService")
public class LoggingEventExceptionServiceImpl extends BaseServiceImpl<LoggingEventExceptionMapper, LoggingEventException, LoggingEventExceptionExample> implements LoggingEventExceptionService {

    @Autowired
    LoggingEventExceptionMapper loggingEventExceptionMapper;
}
