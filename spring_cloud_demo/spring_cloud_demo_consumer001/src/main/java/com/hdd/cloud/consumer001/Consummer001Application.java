package com.hdd.cloud.consumer001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 启动类
 *
 * @author bill.hao
 * @create 2018/11/27 下午 6:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consummer001Application {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(Consummer001Application.class, args);
    }
}
