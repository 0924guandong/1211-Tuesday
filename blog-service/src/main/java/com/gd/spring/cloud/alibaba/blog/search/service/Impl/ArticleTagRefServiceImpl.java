package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.ArticleTagRefMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.ArticleTagRefService;

@Service
public class ArticleTagRefServiceImpl implements ArticleTagRefService {

    @Resource
    private ArticleTagRefMapper articleTagRefMapper;

}

