package com.zy.springboot.service.impl;

import com.zy.springboot.dao.AreaDao;
import com.zy.springboot.domain.Area;
import com.zy.springboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zy on 2019/1/23
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> findAreaByName(String areaName) {
        return areaDao.findByName(areaName);
    }
}
