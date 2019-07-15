package com.chinasoftintership.ordermeal.web;

import com.chinasoftintership.ordermeal.dal.entity.Tables;
import com.chinasoftintership.ordermeal.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TablesController {
    @Autowired
    private TablesService tablesService;

    @RequestMapping("/desks/get")
    public List<Tables> selectTables()
    {
        return tablesService.selectTables();
    }

}
