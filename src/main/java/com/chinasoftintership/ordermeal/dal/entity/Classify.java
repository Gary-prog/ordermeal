package com.chinasoftintership.ordermeal.dal.entity;
//菜品分类
import javax.persistence.*;

@Entity
@Table(name="classification")

public class Classify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classifyId;//分类编号
    private String classification;//分类名称

    public int getClassifyId() {
        return classifyId;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassifyId(int classifyId) {
        this.classifyId = classifyId;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "classifyId=" + classifyId +
                ", classification='" + classification + '\'' +
                '}';
    }
}
