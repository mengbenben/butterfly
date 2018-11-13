package com.tech.butterfly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassNameIndexController
 * @Author benben
 * @Date2018-06-01 17:01
 **/
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String getIndex(ModelMap map){
        return "index";
    }

    @RequestMapping(value = "/")
    public String getHome(ModelMap map){
        return "home/homepage";
    }

}
