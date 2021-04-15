package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: lenovo
 * @Date: 2021-03-12 16:45
 * @Description:
 */
@Mapper
@Repository
public interface TestDao {

    List<Integer> findAll();
}
