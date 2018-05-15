package com.example.gas.Mapper;

import com.example.gas.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author li
 * @create 2018-05-11 10:59
 * @desc
 **/
@Mapper
@Service
public interface UserinfoMapper {
    int insert(@Param("pojo") Userinfo pojo);

    int insertList(@Param("pojo") List<Userinfo> pojos);

    int update(@Param("pojo") Userinfo pojo);

    Userinfo get(@Param("id") int id);

    List<Userinfo> getList();

    int delete(@Param("id") int id);

    Userinfo login(@Param("userName") String userName, @Param("password") String password);
}
