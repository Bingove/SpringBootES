package com.qfedu.bootes.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:11
 */
@Document(indexName = "money_news_cdj",type = "newsPo")
public class NewsES {
    @Id
    private Integer id;
    private String title;


    public NewsES() {
    }

    public NewsES(Integer id, String title) {
        this.id = id;
        this.title = title;

    }

    public int getId() {
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

}
