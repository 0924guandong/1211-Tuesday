package com.gd.spring.cloud.alibaba.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ProviderSentinelApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/16 0016 下午 7:29
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderSentinelApplication.class,args);
    }
}
