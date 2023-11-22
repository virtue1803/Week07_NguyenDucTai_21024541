package dev.week7_nguyenductai_21024541.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class ProductPriceId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
    @Column(name = "price_date_time")
    private LocalDateTime product_date_time;

    public ProductPriceId() {
    }

    public ProductPriceId(Product product, LocalDateTime product_date_time) {
        this.product = product;
        this.product_date_time = product_date_time;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getProduct_date_time() {
        return product_date_time;
    }

    public void setProduct_date_time(LocalDateTime product_date_time) {
        this.product_date_time = product_date_time;
    }

    @Override
    public String toString() {
        return "ProductPriceId{" +
                "product=" + product +
                ", product_date_time=" + product_date_time +
                '}';
    }
}
