package com.example.gas.Controller;


import com.example.gas.Config.Common;
import com.example.gas.Mapper.UserinfoMapper;
import com.example.gas.biz.IUserinfoService;
import com.example.gas.entity.Userinfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

/**
 * @author li
 * @create 2018-05-11 13:23
 * @desc 用户信息
 **/
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {
    @Autowired
    UserinfoMapper userinfoMapper;
    @Autowired
    IUserinfoService iUserinfoService;

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping("login")
    Userinfo login(String userName, String password){
        Userinfo userinfo=userinfoMapper.login(userName,password);
        Map map=new HashMap();
        if (userinfo!=null){
            map.put("status","success");
            map.put("登陆成功",userinfo);
        }else {
            map.put("status","error");
            map.put("登陆失败","用户名不存在或密码错误");

        }
        return userinfo;
    }

    /**
     * 通过id查询信息
     * @param id
     * @return
     */
    @RequestMapping("getById")
    Userinfo getById(int id){
        return userinfoMapper.get(id);
    }
    @RequestMapping("getList")
    PageInfo<Userinfo> getList(int pageNo){
        List<Userinfo> userinfos = iUserinfoService.findByPage(pageNo,Common.USERPAGESIZE);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Userinfo> pageInfo = new PageInfo<Userinfo>(userinfos);
        return  pageInfo;
    }
    @RequestMapping("searchByName")
    PageInfo<Userinfo> searchByName(String unit_name,int pageNo){
        List<Userinfo> userinfos = iUserinfoService.searchByName(pageNo, Common.USERPAGESIZE,unit_name);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Userinfo> pageInfo = new PageInfo<Userinfo>(userinfos);
        return  pageInfo;
    }
}
