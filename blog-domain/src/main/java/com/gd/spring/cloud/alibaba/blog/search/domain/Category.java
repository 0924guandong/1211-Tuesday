package com.gd.spring.cloud.alibaba.blog.search.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "category")
public class Category implements Serializable {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(generator = "JDBC")
    private Integer categoryId;

    @Column(name = "category_pid")
    private Integer categoryPid;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_description")
    private String categoryDescription;

    @Column(name = "category_order")
    private Integer categoryOrder;

    @Column(name = "category_icon")
    private String categoryIcon;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return category_pid
     */
    public Integer getCategoryPid() {
        return categoryPid;
    }

    /**
     * @param categoryPid
     */
    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    /**
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return category_description
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * @param categoryDescription
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    /**
     * @return category_order
     */
    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    /**
     * @param categoryOrder
     */
    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    /**
     * @return category_icon
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * @param categoryIcon
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }
}