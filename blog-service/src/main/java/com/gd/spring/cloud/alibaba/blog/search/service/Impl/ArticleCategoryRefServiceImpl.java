package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.mapper.ArticleCategoryRefMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.ArticleCategoryRefService;

@Service
public class ArticleCategoryRefServiceImpl implements ArticleCategoryRefService {

    @Resource
    private ArticleCategoryRefMapper articleCategoryRefMapper;

}

