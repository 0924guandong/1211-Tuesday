package com.gd.spring.cloud.alibaba.blog.search.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/16 0016 下午 8:11
 * @Version 1.0
 */

@RefreshScope
@RestController
public class ConsumerController {

    @GetMapping("var1")
    public Object var1(){
        return Arrays.asList("abc","xyz");
    }

    @RequestMapping("/edit")
    @SentinelResource("edit")   //必须的有
    public Object edit(@RequestParam(required = false) String id,
                       @RequestParam(required = false) Integer age) {
        return Arrays.asList("abc","xyz");
    }

}
