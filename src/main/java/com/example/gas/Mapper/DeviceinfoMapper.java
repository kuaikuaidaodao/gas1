package com.example.gas.Mapper;

import com.example.gas.entity.DeviceDateCurrent;
import com.example.gas.entity.Deviceinfo;
import com.example.gas.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface DeviceinfoMapper {
    List<DeviceDateCurrent> getList(String unit_name);
}
