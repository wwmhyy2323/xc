package com.xuecheng.content.service;
/*
 * @  Author  mikasa
 * @  Date  2023/04/05 16:22
 * @  Version 1.0
 */


import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

public interface CourseTeacherService {

    List<CourseTeacher> getCourseTeacherList(Long courseId);

    CourseTeacher saveCourseTeacher(CourseTeacher courseTeacher);

    void deleteCourseTeacher(Long courseId, Long teacherId);
}
