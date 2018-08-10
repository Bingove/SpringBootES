package com.qfedu.bootes.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:11
 */
@Document(indexName = "newsindex",type = "news")
public class News {
    @Id
    private Integer id;
    private String title;
    private String url;

    public News() {
    }

    public News(Integer id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
