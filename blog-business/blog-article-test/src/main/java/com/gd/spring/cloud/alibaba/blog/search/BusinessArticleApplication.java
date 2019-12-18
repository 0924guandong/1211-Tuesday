package com.gd.spring.cloud.alibaba.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

/**
 * @ClassName BusinessArticleApplication
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/11 0011 下午 3:29
 * @Version 1.0
 */

@SpringBootApplication
public class BusinessArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessArticleApplication.class,args);
    }
}
