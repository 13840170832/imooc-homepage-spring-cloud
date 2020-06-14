package com.imooc.homepage.service;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfoRequest;

import java.util.List;

public interface ICourseService {

    /**通过 id 获取课程信息*/
    CourseInfo getCourseInfo(Long id);

    /**通过 ids 获取课程信息*/
    List<CourseInfo> getCourseInfos(CourseInfoRequest request);

}