package com.tech.butterfly.demo.service;

import com.tech.butterfly.demo.model.Area;
import com.github.pagehelper.PageInfo;

public interface IAreaService {
    PageInfo<Area> qryAreaList(int pageNum, int pageSize);
}
