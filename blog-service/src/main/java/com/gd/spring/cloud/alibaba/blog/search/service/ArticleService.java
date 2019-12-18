package com.gd.spring.cloud.alibaba.blog.search.service;

import com.gd.spring.cloud.alibaba.blog.search.domain.Article;

import java.util.List;

public interface ArticleService {

    List<Article> listAllNotWithContent();
}

