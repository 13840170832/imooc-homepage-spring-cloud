package com.imooc.homepage.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfoRequest;
import com.imooc.homepage.service.ICourseService;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class HomepageCourseController {

    @Autowired
    private ICourseService courseService;

    /**
     * 不通过网关访问时的url：127.0.0.1:7001/homepage-course/get/course?id=
     * 通过网关访问时的url：  127.0.0.1:9000/imooc/homepage-course/get/course?id=
     */
    @RequestMapping("/get/course")
    public CourseInfo getCourseInfo(Long id){
        log.info("<homepage-course>: get course -> {}", JSON.toJSONString(id));
        return courseService.getCourseInfo(id);
    }

    @PostMapping("/get/courses")
    public List<CourseInfo> getCourseInfos(@RequestBody CourseInfoRequest request){
        log.info("<homepage-course>: get courses -> {}",JSON.toJSONString(request));
        return courseService.getCourseInfos(request);
    }
}
