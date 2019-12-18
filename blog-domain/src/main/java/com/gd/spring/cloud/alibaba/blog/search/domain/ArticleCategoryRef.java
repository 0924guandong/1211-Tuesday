package com.gd.spring.cloud.alibaba.blog.search.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "article_category_ref")
public class ArticleCategoryRef implements Serializable {
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "category_id")
    private Integer categoryId;

    private static final long serialVersionUID = 1L;

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}