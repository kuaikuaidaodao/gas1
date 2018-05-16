package com.example.gas.Mapper;

import com.example.gas.entity.DeviceDateCurrent;
import com.example.gas.entity.DeviceDateHistory;
import com.example.gas.entity.Deviceinfo;
import com.example.gas.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface DeviceinfoMapper {
    List<DeviceDateCurrent> getList(@Param("unit_name") String unit_name);
    List<DeviceDateCurrent> getListDefault();

    List<DeviceDateHistory> getListHistory(@Param("device_id") String device_id);

    List<Deviceinfo> getDeviceList();

    List<Deviceinfo> searchDeviceList(@Param("container_id") String container_id);

    int update(Deviceinfo deviceinfo);

    DeviceDateCurrent getDetail(@Param("device_id") String device_id);
}
