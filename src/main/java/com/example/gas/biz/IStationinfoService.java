package com.example.gas.biz;

import com.example.gas.entity.Stationinfo;

import java.util.List;

public interface IStationinfoService {
    int insert(Stationinfo stationinfo);
    int update(Stationinfo stationinfo);
    List<Stationinfo> getList(int pageNo, int pageSize);

    List<Stationinfo> serchByUnitName(int pageNo, int pageSize, String unit_name);
}
