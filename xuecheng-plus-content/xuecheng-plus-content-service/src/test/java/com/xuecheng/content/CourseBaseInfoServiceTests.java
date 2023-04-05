package com.xuecheng.content;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Mr.M
 * @version 1.0
 * @description TODO
 * @date 2023/2/12 9:24
 */
@SpringBootTest
@Slf4j
public class CourseBaseInfoServiceTests {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    public void testCourseBaseInfoService() {

        //查询条件
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java");//课程名称查询条件
        courseParamsDto.setAuditStatus("202004");//202004表示课程审核通过
        //分页参数对象
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(2L);
        pageParams.setPageSize(2L);

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, courseParamsDto);
        System.out.println(courseBasePageResult);

    }

    @Test
    void contextQueryCourseTest() {
        //查询条件
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java");//课程名称查询条件
        courseParamsDto.setAuditStatus("202004");//202004表示课程审核通过

        PageResult<CourseBase> result = courseBaseInfoService.queryCourseBaseList(new PageParams(1L, 10L), courseParamsDto);
        log.info("查询到数据：{}", result);
    }


}
