package com.company.test3.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Customer;

@UiController("test3_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}