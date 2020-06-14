package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomepageUserDao extends JpaRepository<HomepageUser,Long> {

    HomepageUser findByUsername(String username);
}
