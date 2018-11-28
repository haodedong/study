package com.hdd.cloud.demo.client002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 *
 * @author bill.hao
 * @create 2018/11/27 下午 7:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Client002Application {
    public static void main(String[] args) {
        SpringApplication.run(Client002Application.class, args);
    }
}
