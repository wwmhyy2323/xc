package com.xuecheng.content.service;
/*
 * @  Author  mikasa
 * @  Date  2023/04/08 15:11
 * @  Version 1.0
 */


import com.xuecheng.content.model.dto.CoursePreviewDto;

public interface CoursePublishService {


    /**
     * @description 获取课程预览信息
     * @param courseId 课程id
     * @return com.xuecheng.content.model.dto.CoursePreviewDto
     * @author Mr.M
     * @date 2022/9/16 15:36
     */
    public CoursePreviewDto getCoursePreviewInfo(Long courseId);

    /**
     * @description 提交审核
     * @param courseId  课程id
     * @return void
     * @author Mr.M
     * @date 2022/9/18 10:31
     */
    public void commitAudit(Long companyId,Long courseId);

}
