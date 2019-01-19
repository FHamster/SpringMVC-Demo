package com.FHamster.SpringMVCDemo.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacePairControllerImpl
{
    @RequestMapping(value = "/hello")
    public ModelAndView hello()
    {
        ModelAndView mv = new ModelAndView();

        mv.addObject("message", "message from spring");

        mv.setViewName("hello");

        return mv;
    }
}
