package com.hdd.cloud.ribbonconfig;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon config class
 *
 * @author bill.hao
 * @create 2018/11/28 下午 8:04
 */
@Configuration
public class TestConfig {
    @Autowired
    IClientConfig iClientConfig;

    @Bean
    public IRule ribbonRule(IClientConfig iClientConfig){
        return new RandomRule();
    }

}
