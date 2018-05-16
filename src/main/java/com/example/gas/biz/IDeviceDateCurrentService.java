package com.example.gas.biz;

import com.example.gas.entity.DeviceDateCurrent;
import com.example.gas.entity.DeviceDateHistory;
import com.example.gas.entity.Deviceinfo;

import java.util.List;

public interface IDeviceDateCurrentService {
    List<DeviceDateCurrent> getList(int pageNo, int pageSize,String unit_name);
    List<DeviceDateCurrent> getListDefault(int pageNo, int pageSize);

    List<DeviceDateHistory> getListHistory(int pageNo, int devicepagesize, int device_id);

    List<Deviceinfo> getDeviceList(int pageNo, int pageSize);
    List<Deviceinfo> searchDeviceList(int pageNo, int pageSize,String container_id);
}
