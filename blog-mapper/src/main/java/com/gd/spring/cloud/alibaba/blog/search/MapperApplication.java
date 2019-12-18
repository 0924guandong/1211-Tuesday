package com.gd.spring.cloud.alibaba.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName MapperApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/11 0011 下午 2:45
 * @Version 1.0
 */

@EnableDiscoveryClient
@MapperScan("com.gd.spring.cloud.alibaba.blog.search.mapper")
@SpringBootApplication
public class MapperApplication {
    public static void main(String[] args) {
        SpringApplication.run(MapperApplication.class,args);
    }
}
