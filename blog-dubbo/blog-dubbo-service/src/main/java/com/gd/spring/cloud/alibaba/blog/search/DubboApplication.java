package com.gd.spring.cloud.alibaba.blog.search;

import org.apache.dubbo.config.spring.util.PropertySourcesUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName DubboApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/13 0013 下午 7:04
 * @Version 1.0
 */
@SpringBootApplication
public class DubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboApplication.class,args);
    }
}
