package com.gd.spring.cloud.alibaba.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName GateSentinelApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/16 0016 下午 9:35
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GateSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateSentinelApplication.class,args);
    }
}
