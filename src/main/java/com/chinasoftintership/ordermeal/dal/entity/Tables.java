package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;

@Entity
@Table(name="tables")
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int table_id;
    private int capacity;
    private String table_status;

    public int getTable_id() {
        return table_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTable_status() {
        return table_status;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTable_status(String table_status) {
        this.table_status = table_status;
    }

}
