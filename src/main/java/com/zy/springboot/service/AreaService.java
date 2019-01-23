package com.zy.springboot.service;

import com.zy.springboot.domain.Area;

import java.util.List;

/**
 * Created by zy on 2019/1/23
 */
public interface AreaService {

    List<Area> findAreaByName(String areaName);

}
