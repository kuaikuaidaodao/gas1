package com.example.gas.Controller;

import com.example.gas.Config.Common;
import com.example.gas.biz.IStationinfoService;
import com.example.gas.entity.DeviceDateCurrent;
import com.example.gas.entity.Stationinfo;
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
    IStationinfoService iStationinfoService;

    /**
     * 站点增加
     * @param stationinfo
     * @return
     */
    @RequestMapping("insert")
    int insert(Stationinfo stationinfo){
    return iStationinfoService.insert(stationinfo);

}

    /**
     * 站点修改
     * @param stationinfo
     * @return
     */
    @RequestMapping("update")
    int update(Stationinfo stationinfo){
        return iStationinfoService.update(stationinfo);

    }

    /**
     * 站点列表
     * @param pageNo
     * @return
     */
    @RequestMapping("getList")
    PageInfo<Stationinfo> getList(int pageNo){
        List<Stationinfo> stationinfos = iStationinfoService.getList(pageNo,Common.STATIONPAGESIZE);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Stationinfo> pageInfo = new PageInfo<Stationinfo>(stationinfos);
        return  pageInfo;
    }

    /**
     * 通过所属单位名称查询站点
     * @param unit_name
     * @param pageNo
     * @return
     */
    @RequestMapping("serchByUnitName")
    public PageInfo<Stationinfo> serchByUnitName(String unit_name, int pageNo){
        List<Stationinfo> stationinfos = iStationinfoService.serchByUnitName(pageNo, Common.STATIONPAGESIZE,unit_name);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Stationinfo> pageInfo = new PageInfo<Stationinfo>(stationinfos);
        return  pageInfo;
    }
}
