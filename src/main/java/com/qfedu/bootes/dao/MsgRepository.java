package com.qfedu.bootes.dao;

import com.qfedu.bootes.entity.Msg;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Bingove
 * @Date 2018/8/9 0009 下午 12:05
 */
public interface MsgRepository extends JpaRepository<Msg, Integer> {
    Msg findById(int id);

}
