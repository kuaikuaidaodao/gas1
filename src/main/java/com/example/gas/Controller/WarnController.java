package com.example.gas.Controller;

import com.example.gas.Config.Common;
import com.example.gas.Mapper.WarninfoMapper;
import com.example.gas.biz.IWarninfoService;
import com.example.gas.entity.Userinfo;
import com.example.gas.entity.Warninfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warn")
public class WarnController {
    @Autowired
    IWarninfoService iWarninfoService;
    @Autowired
    WarninfoMapper warninfoMapper;
    @RequestMapping("update")
    public int  update(Warninfo warninfo){
        return warninfoMapper.update(warninfo);
    }
    @RequestMapping("insert")
    public void insert(Warninfo warninfo){
        warninfoMapper.insert(warninfo);
    }
    @RequestMapping("getList")
    PageInfo<Warninfo> getList(int pageNo){
        List<Warninfo> warninfos = iWarninfoService.getList(pageNo, Common.USERPAGESIZE);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInf0
        PageInfo<Warninfo> pageInfo = new PageInfo<Warninfo>(warninfos);
        return  pageInfo;
    }
    @RequestMapping("saveOrUpdate")
    public int saveOrUpdate(Warninfo warninfo){
        String id=String.valueOf(warninfo.getDevice_id());
        System.out.println(id+"---------");
        String[] ids=id.split(",");
        int k=1;
        if (ids.length>0){
            for (String device_id:ids){
                warninfo.setDevice_id(Long.valueOf(device_id));
               int i= warninfoMapper.saveOrUpdate(warninfo);
               if (i!=1){
                   k=0;
               }
            }
        }
            return k;
    }

}
