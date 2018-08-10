package com.qfedu.bootes.dao;

import com.qfedu.bootes.domain.News;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:12
 */
public interface NewsESDao extends ElasticsearchRepository<News,Integer> {
    List<News> findAll();
}
