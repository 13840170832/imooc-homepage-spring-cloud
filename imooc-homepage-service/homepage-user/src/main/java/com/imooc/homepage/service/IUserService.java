package com.imooc.homepage.service;

import com.imooc.homepage.UserInfo;
import com.imooc.homepage.vo.CreateUserRequest;
import com.imooc.homepage.vo.UserCourseInfo;
import com.imooc.homepage.vo.UserCourseRequest;
import org.springframework.data.annotation.CreatedDate;

public interface IUserService {

    UserInfo createUser(CreateUserRequest request);

    UserCourseInfo addUserCourse(UserCourseRequest request);

    UserInfo getUserInfo(Long id);

    UserCourseInfo getUserCourseInfo(Long id);
}
