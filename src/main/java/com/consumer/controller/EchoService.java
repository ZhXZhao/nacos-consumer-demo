package com.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author : zhaofei
 * @create 2024/5/10 13:36
 */
@FeignClient(value = "nacos-provider-demo")
public interface EchoService {
    @RequestMapping(value = "/echo-provider", method = RequestMethod.GET)
    String echo();
}
