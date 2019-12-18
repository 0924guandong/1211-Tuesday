package com.gd.spring.cloud.alibaba.blog.search.service.Impl;

import com.gd.spring.cloud.alibaba.blog.search.domain.Article;
import com.gd.spring.cloud.alibaba.blog.search.mapper.ArticleMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gd.spring.cloud.alibaba.blog.search.service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> listAllNotWithContent() {
        return this.articleMapper.listAllNotWithContent();
    }
}

