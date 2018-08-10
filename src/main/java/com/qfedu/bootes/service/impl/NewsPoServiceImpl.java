package com.qfedu.bootes.service.impl;

import com.qfedu.bootes.dao.NewsRepository;
import com.qfedu.bootes.domain.NewsPo;
import com.qfedu.bootes.service.NewsPoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 22:34
 */
@Service
public class NewsPoServiceImpl implements NewsPoService {
    @Autowired
    private NewsRepository repository;
    @Override
    public NewsPo save(NewsPo newsPo) {
        return repository.save(newsPo);
    }

    @Override
    public List<NewsPo> queryAllByTitle(String title) {
        return repository.queryAllByTitle(title);
    }
}
