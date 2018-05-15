package com.example.gas.biz;

import com.example.gas.entity.Userinfo;

import java.util.List;

/**
 * @author li
 * @create 2018-05-11 16:08
 * @desc
 **/
public interface IUserinfoService {
    List<Userinfo> findByPage(int pageNo, int pageSize);

    List<Userinfo> searchByName(int i, int i1, String unit_name);
}
