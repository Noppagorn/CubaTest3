package com.company.test3.web.screens.order;

import com.company.test3.entity.Customer;
import com.company.test3.entity.OrderLine;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Order;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("test3_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    private CollectionPropertyContainer<OrderLine> linesDc;

    @Subscribe(id = "linesDc", target = Target.DATA_CONTAINER)
    private void onLinesDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderLine> event) {
        if (event.getChangeType() != CollectionChangeType.REFRESH){
            calculateAmount();
        }
    }

    protected void calculateAmount(){
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderLine line: linesDc.getItems()){
            amount = amount.add(line.getProduct().getPrice().multiply(line.getQuabtitu()));
        }
        getEditedEntity().setAmount(amount);
    }
}