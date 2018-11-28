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
        /**
         * 未使用@LoadBlance注解时，需要LoadBalancerClient选取实例和拼接URL，然后通过restTemplate调用
         */
     /*ServiceInstance serviceInstance = loadBalancerClient.choose("client001");
       return restTemplate.getForObject(serviceInstance.getUri()+"/hello/world", String.class);*/

        /**
         * 当使用@LoadBlance注解时 消费者 能够获取到所有的服务清单，不需要拼接url，端口号，直接 服务名+方法即可以调用
         */
        return restTemplate.getForObject("http://client001/hello/world", String.class);
    }
}
