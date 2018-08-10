package com.qfedu.bootes.controller;

import com.qfedu.bootes.Vo.R;
import com.qfedu.bootes.entity.Msg;
import com.qfedu.bootes.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/9 0009 下午 12:12
 */
@RestController
public class MsgController {
    @Autowired
    private MsgService service;

    @PostMapping("msgadd.do")
    public R add(String title) {
        Msg msg = new Msg(title);
        msg.setMessage(title);
        if (service.save(msg)) {
            return R.ok("success");
        } else {
            return R.error("失败");
        }
    }

    //查询全部
    @GetMapping("msglist.do")
    public List<Msg> query() {
        return service.queryAll();
    }

   /* //查询单个 ByID
    @GetMapping("msglist.do")
    public Msg queryById(int id) {
        return service.queryById(id);
    }*/

}
