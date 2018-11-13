package com.tech.butterfly.demo.controller;

import com.tech.butterfly.demo.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 地区
 */
@Controller
@RequestMapping(value = "/area")
public class AreaController {

    @Autowired
    private IAreaService areaService;

    @ResponseBody
    @GetMapping("/all")
    public Object qryAreaList(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                      int pageNum,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                      int pageSize){
        return areaService.qryAreaList(pageNum,pageSize);
    }

}
