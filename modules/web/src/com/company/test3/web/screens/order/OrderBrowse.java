package com.company.test3.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Order;

@UiController("test3_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}