package com.qfedu.bootes.service.impl;

import com.qfedu.bootes.dao.NewsESDao;
import com.qfedu.bootes.domain.News;
import com.qfedu.bootes.service.NewsESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:16
 */
@Service
public class NewsESServiceImpl implements NewsESService {
   @Autowired
   private NewsESDao newsESDao;
    @Override
    public News save(News news) {
        return newsESDao.save(news);
    }

    @Override
    public void delete(int id) {
        newsESDao.deleteById(id);
    }

    @Override
    public long queryCount() {
        return newsESDao.count();
    }

    @Override
    public List<News> queryAll() {
        return newsESDao.findAll();
    }
}
