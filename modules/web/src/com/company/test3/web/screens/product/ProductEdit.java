package com.company.test3.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Product;

@UiController("test3_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}