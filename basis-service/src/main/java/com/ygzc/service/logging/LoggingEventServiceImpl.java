package com.ygzc.service.logging;

import com.ygzc.api.logging.LoggingEventService;
import com.ygzc.common.service.impl.BaseServiceImpl;
import com.ygzc.dao.mapper.logging.LoggingEventMapper;
import com.ygzc.dao.model.logging.LoggingEvent;
import com.ygzc.dao.model.logging.LoggingEventExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018/1/27 下午11:45<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Service("loggingEventService")
public class LoggingEventServiceImpl extends BaseServiceImpl<LoggingEventMapper, LoggingEvent, LoggingEventExample> implements LoggingEventService {

    @Autowired
    LoggingEventMapper loggingEventMapper;
}
