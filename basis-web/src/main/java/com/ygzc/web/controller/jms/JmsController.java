package com.ygzc.web.controller.jms;

import com.ygzc.api.jms.JmsSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 名称：JmsController<br>
 * <p>
 * 描述：jms消息传输<br>
 *
 * @author yanl<br>
 * 时间：<br>
 * 2018-01-06 22:28:15<br>
 * 版权：<br>
 * Copyright 2017 <a href="" target="_blank"></a>. All rights reserved.
 */
@Controller
@RequestMapping("/jms")
public class JmsController {

    @Autowired
    private JmsSenderService jmsSenderService;

    /**
     * 一对一队列消息
     */
    // 方法一
    private static final String queueDestination = "yan.queue";
    // 方法二
    /*
    @Autowired
    private Destination queueDestination;
    */

    /**
     * pub/sub模型（发布/订阅）
     */
    // 方法一
    private static final String topicDestination = "yan.topic";
    // 方法二
    /*
    @Autowired
    private Destination topicDestination;
    */

    /**
     * 队列消息测试方法
     */
    @RequestMapping("/queue/test")
    @ResponseBody
    public String queueTest() {
        System.out.println("Queue消息队列发送消息");
        jmsSenderService.sendQueue(queueDestination, "这是发送的Queue消息");
        return "Queue Send Success";
    }

    /**
     * 订阅消息测试
     */
    @RequestMapping("/topic/test")
    @ResponseBody
    public String topicTest() {
        System.out.println("Topic消息队列发送消息");
        jmsSenderService.sendTopic(topicDestination, "这是发送的Topic消息");
        return "Topic Send Success";
    }

}
