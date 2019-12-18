package com.gd.spring.cloud.alibaba.blog.search.controller;

import com.gd.spring.cloud.alibaba.blog.search.api.UserService;
import com.gd.spring.cloud.alibaba.blog.search.domain.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName DatasSources
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/11 0011 下午 5:38
 * @Version 1.0
 */

@RefreshScope
@RestController
public class DatasSources {


    @Reference(version = "1.0.0")
    private UserService userService;

    @Resource
    private FeignController feignController;

    @Value(value = "${user.name}")
    private String name;

    @GetMapping(value = "config")
    public String config(){
        return "hello，config"+name;
    }

    @GetMapping(value = "var1")
    public String var1(){
        return feignController.article();
    }

    @GetMapping(value = "var2")
    public String var2(){
        return ""+feignController.var2();
    }


    @GetMapping(value = "var3")
    public User var3(){
        return userService.getUser();
    }

    @GetMapping(value = "var4")
    public String var4(){
        return feignController.var4();
    }

}
