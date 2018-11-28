package com.hdd.cloud.demo.client002.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author bill.hao
 * @create 2018/11/27 下午 7:19
 */
@RestController
public class HelloControllerImpl {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable(value = "name") String name){
        System.out.println("client001");
        return "hello"+name;
    }
}
