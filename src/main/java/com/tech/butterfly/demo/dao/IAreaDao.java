package com.tech.butterfly.demo.dao;

import com.tech.butterfly.demo.model.Area;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface IAreaDao {
    List<Area> qryAreaList();
}
