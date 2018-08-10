package com.qfedu.bootes.entity;

import javax.persistence.*;

/**
 * @Author Bingove
 * @Date 2018/8/9 0009 下午 12:01
 */
@Entity
@Table(name = "t_msg")
public class Msg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "message", length = 40)
    private String message;

    public Msg() {
    }

    public Msg(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
