package dev.week7_nguyenductai_21024541.backend.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderDetailId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    public OrderDetailId() {
    }

    public OrderDetailId(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetailId{" +
                "order=" + order +
                ", product=" + product +
                '}';
    }
}
