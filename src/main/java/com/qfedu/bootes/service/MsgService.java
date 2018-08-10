package com.qfedu.bootes.service;

import com.qfedu.bootes.entity.Msg;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/9 0009 下午 12:07
 */
public interface MsgService {
    //添加
    boolean save(Msg msg);

    //查询
    List<Msg> queryAll();

    //查询单个
    Msg queryById(int id);
}
