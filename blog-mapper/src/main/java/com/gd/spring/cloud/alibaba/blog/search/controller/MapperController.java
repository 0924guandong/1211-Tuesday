package com.gd.spring.cloud.alibaba.blog.search.controller;

import com.gd.spring.cloud.alibaba.blog.search.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName MapperController
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/12 0012 下午 8:38
 * @Version 1.0
 */
@RestController
public class MapperController {

    @Resource
    private ArticleMapper articleMapper;

    @Value(value = "${server.port}")
    private String port;

    @GetMapping("article")
    public String article(){
        return "Mapper,article";
    }

    @GetMapping("var2")
    public String var2(){
        return ""+articleMapper.listAllNotWithContent();
    }

    @GetMapping(value = "var4")
    public String var4(){
        return port;
    }
}
