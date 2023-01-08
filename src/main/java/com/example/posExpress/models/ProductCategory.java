package com.example.posExpress.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "pos_ctl_categories")
public class ProductCategory {

    private @Id Integer id;
    private String categoryName;
    private float discount;
    private Date createdAt;
    private Date updatedAt;

    public ProductCategory(Integer id, String categoryName, float discount, Date createdAt, Date updatedAt) {
        this.id = id;
        this.categoryName = categoryName;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
