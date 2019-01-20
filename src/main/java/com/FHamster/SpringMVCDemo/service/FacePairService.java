package com.FHamster.SpringMVCDemo.service;

import com.FHamster.SpringMVCDemo.model.FacePairBean;

import java.util.List;


public interface FacePairService
{
    /**
     * 根据id查询信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    FacePairBean selectById(String id) throws Exception;

    /**
     * 查询所有的信息
     *
     * @return
     * @throws Exception
     */
    List<FacePairBean> selectAll() throws Exception;
}
