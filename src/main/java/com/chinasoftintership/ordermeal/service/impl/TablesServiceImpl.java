package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.TablesRepo;
import com.chinasoftintership.ordermeal.dal.entity.Tables;
import com.chinasoftintership.ordermeal.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TablesServiceImpl implements TablesService {

    @Autowired
    private TablesRepo tablesRepo;
    @Override
    public List<Tables> selectTables() {

        return tablesRepo.findAll();
    }
    public void setStatus(Integer tableId){
        Optional<Tables> tables = tablesRepo.findById(tableId);
        Tables modifyid = tables.get();
        modifyid.setTableStatus("已预定");
    }
}
