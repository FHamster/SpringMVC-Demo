package com.FHamster.SpringMVCDemo.service.impl;

import com.FHamster.SpringMVCDemo.dao.FacePairDao;
import com.FHamster.SpringMVCDemo.model.FacePairBean;
import com.FHamster.SpringMVCDemo.service.FacePairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FacePairServiceImpl implements FacePairService
{
    @Resource
    private FacePairDao dao;

    @Override
    public FacePairBean selectById(String id) throws Exception
    {
        return dao.selectById(id);
    }

    @Override
    public List<FacePairBean> selectAll() throws Exception
    {
        return dao.selectAll();
    }
}
