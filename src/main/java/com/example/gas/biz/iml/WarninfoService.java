package com.example.gas.biz.iml;

import com.example.gas.Mapper.WarninfoMapper;
import com.example.gas.biz.IWarninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author li
 * @create 2018-05-11 16:07
 * @desc
 **/
@Service
@Transactional(readOnly = true)
public class WarninfoService implements IWarninfoService {
    @Autowired
    private WarninfoMapper warninfoMapper;

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }
}