package com.gd.spring.cloud.alibaba.blog.search.controller;

import com.gd.spring.cloud.alibaba.blog.search.mapper.ArticleMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * @ClassName ArticleController
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/11 0011 下午 3:31
 * @Version 1.0
 */
@RestController
public class ArticleController {

    @Resource
    private ArticleMapper articleMapper;

//    @Resource
//    private ArticleService articleService;

    @GetMapping("articleAll")
    public String articleAll(){
        return  ""+articleMapper.selectAll();
    }

//    @GetMapping("method")
//    public String method(){
//        return  ""+articleService.listAllNotWithContent();
//    }


    @GetMapping("config")
    public String config(){
        return "hello,config";
    }

}
