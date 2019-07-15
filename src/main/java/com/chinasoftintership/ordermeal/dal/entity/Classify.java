package com.chinasoftintership.ordermeal.dal.entity;
//菜品分类
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="classification")
@Getter
@Setter
@ToString
public class Classify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classifyId;//分类编号
    private String classification;//分类名称


}
