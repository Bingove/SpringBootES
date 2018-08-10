package com.qfedu.bootes.service.impl;

import com.qfedu.bootes.dao.MsgRepository;
import com.qfedu.bootes.entity.Msg;
import com.qfedu.bootes.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/9 0009 下午 12:08
 */
@Service
public class MsgServiceImpl implements MsgService {
    @Autowired
    private MsgRepository repository;
    @Override
    public boolean save(Msg msg) {
        if (repository.save(msg) != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Msg> queryAll() {
        return repository.findAll();
    }

    @Override
    public Msg queryById(int id) {
        return repository.findById(id);
    }
}
