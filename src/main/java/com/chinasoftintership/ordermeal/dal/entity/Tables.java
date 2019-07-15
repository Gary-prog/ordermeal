package com.chinasoftintership.ordermeal.dal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tables")
@Getter
@Setter
@ToString
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;
    private int capacity;//容纳人数
    private String tableStatus;
    private String tableName;
}


