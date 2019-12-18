package com.gd.spring.cloud.alibaba.blog.search.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @ClassName ProviderController
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/16 0016 下午 8:15
 * @Version 1.0
 */

@RefreshScope
@RestController
public class ProviderController {

    @GetMapping("get")
    public Object get(){
        return Arrays.asList("ABC","LMN");
    }
}
