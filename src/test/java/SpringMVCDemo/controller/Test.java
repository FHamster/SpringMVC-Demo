package SpringMVCDemo.controller;


import com.FHamster.SpringMVCDemo.model.FacePairBean;
import com.FHamster.SpringMVCDemo.service.FacePairService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.ws.rs.core.Context;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class Test
{
    @Autowired
    private FacePairService service;

    @org.junit.Test
    public void testOne()
    {
        String id = "1";
        FacePairBean bean;
        try
        {
            bean = service.selectById(id);
            System.out.println(bean);
            System.out.println(123);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
