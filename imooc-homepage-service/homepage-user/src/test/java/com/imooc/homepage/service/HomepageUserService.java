package com.imooc.homepage.service;

import com.alibaba.fastjson.JSON;
import com.imooc.homepage.Application;
import com.imooc.homepage.dao.HomepageUserCourseDao;
import com.imooc.homepage.vo.CreateUserRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class HomepageUserService {

    @Autowired
    private IUserService userService;

    @Autowired
    private HomepageUserCourseDao userCourseDao;

    @Test
    @Transactional
    public void testCreateUser(){
        System.out.println(JSON.toJSONString(userService.createUser(
                new CreateUserRequest("xue","xue@imooc.com")
        )));
    }
}
