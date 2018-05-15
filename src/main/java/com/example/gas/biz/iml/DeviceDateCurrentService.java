package com.example.gas.biz.iml;

import com.example.gas.Mapper.DeviceinfoMapper;
import com.example.gas.biz.IDeviceDateCurrentService;
import com.example.gas.entity.DeviceDateCurrent;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class DeviceDateCurrentService implements IDeviceDateCurrentService {
    @Autowired
    DeviceinfoMapper deviceinfoMapper;
    @Override
    public List<DeviceDateCurrent> getList(int pageNo, int pageSize,String unit_name) {
        PageHelper.startPage(pageNo, pageSize);
        return deviceinfoMapper.getList(unit_name);
    }

    @Override
    public List<DeviceDateCurrent> getListDefault(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return deviceinfoMapper.getListDefault();
    }
}
