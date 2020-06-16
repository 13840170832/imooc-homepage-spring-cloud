package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HomepageUserCourseDao extends JpaRepository<HomepageUserCourse,Long> {

    List<HomepageUserCourse> findAllByUserId(Long userId);

    Optional<HomepageUserCourse> findByUserIdAndCourseId(Long userId, Long courseId);
}
