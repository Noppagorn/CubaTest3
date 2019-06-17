package com.company.test3.web.screens.orderline;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.OrderLine;

@UiController("test3_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
@LoadDataBeforeShow
public class OrderLineEdit extends StandardEditor<OrderLine> {
}