package com.FHamster.SpringMVCDemo.controller.impl;

import com.FHamster.SpringMVCDemo.controller.FacePairController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloControllers是基于注解的控制器
 * 可以同时处理多个请求动作，并且无需实现任何接口
 * org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class HelloController implements FacePairController
{
    private static final Log logger = LogFactory.getLog(HelloController.class);

    /**
     * org.springframework.web.bind.annotation.RequestMapping注解
     * 用于映射请求的URL和请求的方法等等。本例用来映射"/hello"
     * hello只是一个普通方法
     * 该方法返回一个ModelAndView对象
     * @return
     */
    @RequestMapping(value = "/hello")
    public ModelAndView hello()
    {
        //记入日志
        logger.info("hello方法被调用");

        //创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型名称以及模型对象
        ModelAndView mv = new ModelAndView();

        //添加模型数据，可以是任意POJO对象
        mv.addObject("message", "This is message from Spring");

        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("/WEB-INF/views/welcome.jsp");

        //返回ModelAndView对象
        return mv;
    }
}
