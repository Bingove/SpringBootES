package com.qfedu.bootes.service;

import com.qfedu.bootes.domain.NewsPo;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 22:31
 */
public interface NewsPoService {
    NewsPo save(NewsPo newsPo);
    List<NewsPo> queryAllByTitle(String title);
}
