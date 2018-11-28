package com.hdd.cloud.consumer001;

import com.hdd.cloud.ribbonconfig.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
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
@RibbonClient(name = "client001" ,configuration = TestConfig.class)
public class Consummer001Application {

    @Bean
    @LoadBalanced
    /**使用这个loadblanced注解，客户端就使用ribbon 启用了负载均衡，
     * 就可以通过【服务名称+方法】来进行调用。默认会采用轮询的方式去获取调用服务
     */
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(Consummer001Application.class, args);
    }
}
