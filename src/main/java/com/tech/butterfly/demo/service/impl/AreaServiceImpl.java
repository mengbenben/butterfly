package com.tech.butterfly.demo.service.impl;

import com.tech.butterfly.demo.dao.IAreaDao;
import com.tech.butterfly.demo.model.Area;
import com.tech.butterfly.demo.service.IAreaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "areaService")
public class AreaServiceImpl implements IAreaService {

    @Autowired
    private IAreaDao areaDao;//

    @Override
    public PageInfo<Area> qryAreaList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Area> area = areaDao.qryAreaList();
        PageInfo result = new PageInfo(area);
        return result;
    }

}
