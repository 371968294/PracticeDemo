package com.huskey.model;


import org.hibernate.annotations.Formula;

import javax.persistence.*;


/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/21 002121:51
 * @Description:
 */
@Entity(name = "news_inf")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "news_title", length = 50)
    private String title;

    @Column(name = "news_content", length = 500)
    private String content;

    //    @Formula("(select concat(nt.title,nt.content) from news_inf nt where nt.id = id)")
    private String fullContent;

    @Enumerated(EnumType.ORDINAL)
    private Season season;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }


    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
