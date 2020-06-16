package com.imooc.homepage.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCourseRequest {

    private Long userId;

    private List<Long> courseIds;
}
