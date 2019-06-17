package com.company.test3.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Order;

@UiController("test3_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}