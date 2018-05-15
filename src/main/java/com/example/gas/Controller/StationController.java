package com.example.gas.Controller;

import com.example.gas.Mapper.DeviceinfoMapper;
import com.example.gas.biz.IDeviceDateCurrentService;
import com.example.gas.entity.DeviceDateCurrent;
import com.example.gas.entity.Deviceinfo;
import com.example.gas.entity.Userinfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author li
 * @create 2018-05-11 13:33
 * @desc 站点信息
 **/
@RestController
@RequestMapping("/station")
public class StationController {
    @Autowired
    DeviceinfoMapper deviceinfoMapper;
    @Autowired
    IDeviceDateCurrentService iDeviceDateCurrentService;
    @RequestMapping("getList")
    public PageInfo<DeviceDateCurrent> getList(String unit_name){

        List<DeviceDateCurrent> deviceDateCurrents = iDeviceDateCurrentService.getList(1, 15,unit_name);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<DeviceDateCurrent> pageInfo = new PageInfo<DeviceDateCurrent>(deviceDateCurrents);
        return  pageInfo;
    }
}
