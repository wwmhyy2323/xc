package com.xuecheng.content.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FreemarkerController {

    @GetMapping("/testfreemaker")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("name", "mikasa");
        //设置模板名称
        modelAndView.setViewName("test");
        return modelAndView;
    }


}
