package com.gd.spring.cloud.alibaba.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName DatasSourcesApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/12 0012 下午 3:21
 * @Version 1.0
 */

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DatasSourcesApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatasSourcesApplication.class,args);
    }
}
