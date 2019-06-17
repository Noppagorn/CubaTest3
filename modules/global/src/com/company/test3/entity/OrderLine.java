package com.company.test3.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "TEST3_ORDER_LINE")
@Entity(name = "test3_OrderLine")
public class OrderLine extends StandardEntity {
    private static final long serialVersionUID = 924047511445356207L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @Column(name = "QUABTITU")
    protected BigDecimal quabtitu;

    public BigDecimal getQuabtitu() {
        return quabtitu;
    }

    public void setQuabtitu(BigDecimal quabtitu) {
        this.quabtitu = quabtitu;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}