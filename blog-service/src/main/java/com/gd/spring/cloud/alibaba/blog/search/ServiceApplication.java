package com.gd.spring.cloud.alibaba.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ServiceApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/11 0011 下午 4:30
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }
}
