package com.zy.springboot.dao;

import com.zy.springboot.domain.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zy on 2019/1/23
 */
public interface AreaDao {

    List<Area> findByName(@Param("areaName") String areaName);
}
