package com.chinasoftintership.ordermeal.service;

import com.chinasoftintership.ordermeal.dal.entity.Tables;

import java.util.List;


public interface TablesService {
    List<Tables> selectTables();
    void setStatus(Integer tableId);
}
