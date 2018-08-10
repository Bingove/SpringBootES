package com.qfedu.bootes.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:11
 */
@Entity
@Table(name = "t_news")
public class NewsPo {
    @Id
    private Integer id;
    private String title;

    public NewsPo() {
    }

    public NewsPo(Integer id, String title) {
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
