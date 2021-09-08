package com.example.mybatisplus;

import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("loutiancheng");
        user.setPassword("ltc");
        user.setEmail("123456789@123.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
        System.out.println(user);
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(1432886376965079046L);
    }

    @Test
    public void testDeleteBatchId() {
        userMapper.deleteBatchIds(Arrays.asList(1432886376965079043L, 1432886376965079045L));
    }

}
