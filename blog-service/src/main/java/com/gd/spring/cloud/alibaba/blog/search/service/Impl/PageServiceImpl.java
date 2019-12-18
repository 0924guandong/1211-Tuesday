package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.PageMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.PageService;

@Service
public class PageServiceImpl implements PageService {

    @Resource
    private PageMapper pageMapper;

}

