package com.company.test3.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Customer;

@UiController("test3_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}