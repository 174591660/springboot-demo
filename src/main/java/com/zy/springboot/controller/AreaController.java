package com.zy.springboot.controller;

import com.zy.springboot.domain.Area;
import com.zy.springboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zy on 2019/1/23
 */
@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping(value = "/api/areas/{name}")
    private List<Area> findByName(@PathVariable("name") String name) {
        List<Area> areaList = areaService.findAreaByName(name);
        return areaList;
    }

}
