package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : zhaofei
 * @create 2024/5/10 13:39
 */

@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/echo-consumer", method = RequestMethod.GET)
    @ResponseBody
    public String feign() {
        return echoService.echo();
    }
}
