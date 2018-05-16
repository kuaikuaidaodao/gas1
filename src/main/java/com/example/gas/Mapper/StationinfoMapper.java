package com.example.gas.Mapper;

import com.example.gas.entity.Stationinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface StationinfoMapper {
    int insert(@Param("pojo") Stationinfo pojo);
    int update(@Param("pojo") Stationinfo pojo);
    List<Stationinfo> getList();

    List<Stationinfo> serchByUnitName(@Param("unit_name") String unit_name);
}
