package com.qfedu.bootes.controller;

import com.qfedu.bootes.Vo.R;
import com.qfedu.bootes.domain.News;
import com.qfedu.bootes.service.NewsESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:37
 */
@RestController
public class NewsController {

/*    @Autowired
    private ElasticsearchOperations operations;*/
    @Autowired
    private NewsESService service;

    //新增索引
    @PostMapping("newsadd.do")
    public R add(News news) {
        News n1 = service.save(news);
        return R.ok(n1);
    }
    //查询索引

    @GetMapping("newseslist.do")
    public R list() {
        List<News> news = service.queryAll();
        return R.ok(news);
    }
    @GetMapping("newscount.do")
    public Long count() {
        return service.queryCount();
    }
}
