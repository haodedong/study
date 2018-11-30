package com.hdd.cloud.consumer001.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *  制定调用的服务 接口
 *
 * @author bill.hao
 * @create 2018/11/29 下午 3:06
 */
@FeignClient("client001")
public interface HelloFeignClient {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable(value = "name") String name);
}
