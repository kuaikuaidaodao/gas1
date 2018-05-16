package com.example.gas.Controller;

import com.example.gas.Config.Common;
import com.example.gas.Mapper.DeviceinfoMapper;
import com.example.gas.biz.IDeviceDateCurrentService;
import com.example.gas.entity.DeviceDateCurrent;
import com.example.gas.entity.DeviceDateHistory;
import com.example.gas.entity.Deviceinfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    DeviceinfoMapper deviceinfoMapper;
    @Autowired
    IDeviceDateCurrentService iDeviceDateCurrentService;
    @RequestMapping("getList")
    public PageInfo<DeviceDateCurrent> getList(String unit_name, int pageNo){
        List<DeviceDateCurrent> deviceDateCurrents = iDeviceDateCurrentService.getList(pageNo, Common.DEVICEPAGESIZE,unit_name);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<DeviceDateCurrent> pageInfo = new PageInfo<DeviceDateCurrent>(deviceDateCurrents);
        return  pageInfo;
    }
    @RequestMapping("getListDefault")
    public PageInfo<DeviceDateCurrent> getListDefault(int pageNo){
        List<DeviceDateCurrent> deviceDateCurrents = iDeviceDateCurrentService.getListDefault(pageNo, Common.DEVICEPAGESIZE);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<DeviceDateCurrent> pageInfo = new PageInfo<DeviceDateCurrent>(deviceDateCurrents);
        return  pageInfo;
    }
    @RequestMapping("getListHistory")
    public PageInfo<DeviceDateHistory> getListHistory(int device_id,int pageNo){
        List<DeviceDateHistory> deviceDateHistory = iDeviceDateCurrentService.getListHistory(pageNo, Common.DEVICEPAGESIZE,device_id);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<DeviceDateHistory> pageInfo = new PageInfo<DeviceDateHistory>(deviceDateHistory);
        return  pageInfo;
    }
    @RequestMapping("getDeviceList")
    public PageInfo<Deviceinfo> getDeviceList(int pageNo){
        List<Deviceinfo> deviceinfos = iDeviceDateCurrentService.getDeviceList(pageNo, Common.DEVICEPAGESIZE);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Deviceinfo> pageInfo = new PageInfo<Deviceinfo>(deviceinfos);
        return  pageInfo;
    }
    @RequestMapping("searchDeviceList")
    public PageInfo<Deviceinfo> searchDeviceList(int pageNo,String container_id){
        List<Deviceinfo> deviceinfos = iDeviceDateCurrentService.searchDeviceList(pageNo, Common.DEVICEPAGESIZE,container_id);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Deviceinfo> pageInfo = new PageInfo<Deviceinfo>(deviceinfos);
        return  pageInfo;
    }
}
