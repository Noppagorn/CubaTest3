package com.company.test3.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TEST3_CUSTOMER")
@Entity(name = "test3_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 360640816385877403L;
}