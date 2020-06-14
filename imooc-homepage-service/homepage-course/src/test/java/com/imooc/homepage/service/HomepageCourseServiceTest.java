package com.imooc.homepage.service;

import com.alibaba.fastjson.JSON;
import com.imooc.homepage.Application;
import com.imooc.homepage.CourseInfoRequest;
import com.imooc.homepage.dao.HomepageCourseDao;
import com.imooc.homepage.entity.HomepageCourse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HomepageCourseServiceTest {

    @Autowired
    private HomepageCourseDao courseDao;

    @Autowired
    private ICourseService courseService;

    @Test
    public void testCreateCourseInfo(){
        HomepageCourse course1 = new HomepageCourse(
                "JAVA全栈课二期",
                0,"https://www.imooc.com",
                "电商小程序JAVA全栈课升级"
        );

        HomepageCourse course2 = new HomepageCourse(
                "SpringCloud实现前后端分离项目",
                1,
                "https://www.imooc.com/",
                "基于SpringCloud框架实现慕课网主页后端开发");
        System.out.println(courseDao.saveAll(Arrays.asList(course1,course2)).size());

    }

    @Test
    public void testGetCourseInfo(){
        System.out.println(JSON.toJSONString(courseService.getCourseInfo(6L)));
        System.out.println(JSON.toJSONString(courseService.getCourseInfo(10L)));
    }

    @Test
    public void testGetCourseInfos(){
        System.out.println(JSON.toJSONString(courseService.getCourseInfos(
                new CourseInfoRequest(Arrays.asList(6L,7L,8L))
        )));
    }
}
