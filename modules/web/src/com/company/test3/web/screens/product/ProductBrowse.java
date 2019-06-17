package com.company.test3.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.test3.entity.Product;

@UiController("test3_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}