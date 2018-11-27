package com.hdd.cloud.demo.client001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author bill.hao
 * @create 2018/11/27 下午 7:03
 */
@SpringBootApplication
@EnableEurekaClient
public class Client001Application {
    public static void main(String[] args) {
        SpringApplication.run(Client001Application.class, args);
    }
}
