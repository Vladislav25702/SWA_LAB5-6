package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "products", schema = "users", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id")
    private long productId;
    @Basic
    @Column(name = "SectionId")
    private Integer section_Id;
    @Basic
    @Column(name = "Product")
    private String product;


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Integer getSection_Id() {
        return section_Id;
    }

    public void setSection_Id(Integer section_Id) {
        this.section_Id = section_Id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return productId == that.productId && Objects.equals(section_Id, that.section_Id) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, section_Id, product);
    }
}
