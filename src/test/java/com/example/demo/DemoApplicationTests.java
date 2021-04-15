package com.example.demo;

import com.example.demo.Config.RedisConfig;
import com.example.demo.Dao.TestDao;
import com.example.demo.Utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class DemoApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private TestDao testDao;

    @Test
    void contextLoads() {

    }
    @Test
    public void test1() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from basechart ");
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            System.out.println("id:"+id);
        }
    }

    @Test
    public void test2(){

        List<Integer> list = testDao.findAll();

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
//        List<Integer> list = testDao.findAll();
//        redisUtil.set("findAll",list);
        redisUtil.set("a","8毫秒过期",800);
    }


}
