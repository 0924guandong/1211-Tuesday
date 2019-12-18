package com.gd.spring.cloud.alibaba.blog.search.fallback;

import com.gd.spring.cloud.alibaba.blog.search.controller.FeignController;
import org.springframework.stereotype.Component;

/**
 * @ClassName FallbackFeign
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/12 0012 下午 9:18
 * @Version 1.0
 */
@Component
public class FallbackFeign implements FeignController {


    @Override
    public String article() {
        return "滚一边！！！";
    }

    @Override
    public String var2() {
        return "请检查网络问题！！！";
    }

    @Override
    public String var4() {
        return "出错咯";
    }
}
