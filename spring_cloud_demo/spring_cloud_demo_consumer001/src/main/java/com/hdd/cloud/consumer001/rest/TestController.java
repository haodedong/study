package com.hdd.cloud.consumer001.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  controller
 *
 * @author bill.hao
 * @create 2018/11/27 下午 8:13
 */
@RestController
public class TestController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    // 似乎是用来发送rest请求
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("client001");
        String url = "http://client001"+"/hello/2333";
        return restTemplate.getForObject(url, String.class);
    }
}
