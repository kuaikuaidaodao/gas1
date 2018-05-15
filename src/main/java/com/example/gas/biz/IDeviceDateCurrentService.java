package com.example.gas.biz;

import com.example.gas.entity.DeviceDateCurrent;

import java.util.List;

public interface IDeviceDateCurrentService {
    List<DeviceDateCurrent> getList(int pageNo, int pageSize,String unit_name);
}
