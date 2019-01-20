package com.FHamster.SpringMVCDemo.controller;

import com.FHamster.SpringMVCDemo.service.FacePairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/")
public class FacePairController
{
    @Autowired
    FacePairService service;

    @RequestMapping("/selest")
    public void SelectOne(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException
    {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        try
        {
            service.selectById(id);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
