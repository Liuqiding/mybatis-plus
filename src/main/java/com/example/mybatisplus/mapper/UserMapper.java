package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.pojo.User;
import org.springframework.stereotype.Repository;

//在对应的mapper上面继承基本的类 BaseMapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    //所有的CRUD操作都已经编写完成了
    //不需要配置一大堆文件

}
