package dev.week7_nguyenductai_21024541.backend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice {

    @EmbeddedId
    private ProductPriceId productPriceId;

    @ManyToOne
    @JoinColumn(name = "product_id", updatable = false, insertable = false)
    private Product product;

    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "note")
    private String note;

    public ProductPrice() {
    }

    public ProductPrice(Product product, LocalDateTime price_date_time, double price, String note) {
        productPriceId = new ProductPriceId(product, price_date_time);
        this.price = price;
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", productPriceId=" + productPriceId +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
