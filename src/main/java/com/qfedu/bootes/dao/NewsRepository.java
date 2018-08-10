package com.qfedu.bootes.dao;

import com.qfedu.bootes.domain.NewsPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 21:56
 * Spring Data Jpa crud order page
 * 1 对应的实体类
 * 2 主键类型 需要实现序列化
 */
public interface NewsRepository extends JpaRepository<NewsPo, Integer> {
    //方法命名查询
    NewsPo findById(int id);

    //JPQL查询
    @Query(value = "from NewsPo")
    List<NewsPo> queryAll();

    //Sql
    @Query(value = "select id,title from t_news where title=?1", nativeQuery = true)
    List<NewsPo> queryAllByTitle(String title);

}
