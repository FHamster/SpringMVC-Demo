package com.FHamster.SpringMVCDemo.dao;

import com.FHamster.SpringMVCDemo.model.FacePairBean;

import java.util.List;

public interface FacePairDao
{
    /**
     * 增
     *
     * @param bean
     * @return
     * @throws Exception
     */
//    int inser(FacePairBean bean) throws Exception;


    /**
     * 改
     * @param bean
     * @param id
     * @return
     * @throws Exception
     */
//    int update(FacePairBean bean, String id) throws Exception;


    /**
     * 删
     *
     * @param id
     * @return
     * @throws Exception
     */
//    int delete(String id) throws Exception;

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
