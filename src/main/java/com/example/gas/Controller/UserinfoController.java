package com.example.gas.Controller;


import com.example.gas.Mapper.UserinfoMapper;
import com.example.gas.entity.Userinfo;
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
    @RequestMapping("getById")
    Userinfo getById(int id){
        return userinfoMapper.get(id);
    }
    @RequestMapping("getList")
    List<Userinfo> getList(){
        return  userinfoMapper.getList();
    }
}
