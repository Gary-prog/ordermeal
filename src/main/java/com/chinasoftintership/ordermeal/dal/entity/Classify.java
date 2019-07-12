package com.chinasoftintership.ordermeal.dal.entity;
//菜品分类
import javax.persistence.*;

@Entity
@Table(name="classification")
public class Classify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classify_id;//分类编号
    private String classification;//分类名称

    public int getClassify_id() {
        return classify_id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassify_id(int classify_id) {
        this.classify_id = classify_id;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "classify_id=" + classify_id +
                ", classification='" + classification + '\'' +
                '}';
    }
}
