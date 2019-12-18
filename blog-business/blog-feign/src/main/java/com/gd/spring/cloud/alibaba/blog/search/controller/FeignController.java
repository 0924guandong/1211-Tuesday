package com.gd.spring.cloud.alibaba.blog.search.controller;

import com.gd.spring.cloud.alibaba.blog.search.fallback.FallbackFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName FeignController
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/12 0012 下午 8:34
 * @Version 1.0
 */

@FeignClient(value = "article-search",fallback = FallbackFeign.class)
public interface FeignController {

    @GetMapping(value = "article")
    String article();

    @GetMapping(value = "var2")
    String var2();

    @GetMapping(value = "var4")
    String var4();


}
