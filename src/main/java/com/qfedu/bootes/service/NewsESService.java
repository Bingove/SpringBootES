package com.qfedu.bootes.service;

import com.qfedu.bootes.domain.News;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:15
 */
public interface NewsESService {
    News save(News news);
    void delete(int id);
    long queryCount();
    List<News> queryAll();
}
