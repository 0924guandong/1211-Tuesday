package com.gd.spring.cloud.alibaba.blog.search;

import com.gd.spring.cloud.alibaba.blog.search.api.UserService;
import com.gd.spring.cloud.alibaba.blog.search.domain.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName DubboService
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/13 0013 下午 7:49
 * @Version 1.0
 */

@Service(version = "1.0.0")
public class DubboService implements UserService {

    @Value(value = "${server.port}")
    private String port;

    @Override
    public User getUser() {
        User user = new User();
        user.setUsername("发了多少及父类到数据--"+port);
        return user;
    }
}
