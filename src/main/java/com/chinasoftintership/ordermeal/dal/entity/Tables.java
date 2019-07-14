package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;

@Entity
@Table(name="tables")
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;
    private int capacity;//容纳人数
    private String tableStatus;
    private String tableName;

    public String getTableName() {
        return tableName;
    }

    public int getTableId() {
        return tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTableStatus() {
        return tableStatus;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "tableId=" + tableId +
                ", capacity=" + capacity +
                ", tableStatus='" + tableStatus + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
