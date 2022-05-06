package com.nomedaempresa.course.resources;

import com.nomedaempresa.course.entities.Product;
import com.nomedaempresa.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource extends BaseResource<Product> {

    @Autowired
    public ProductResource(ProductService productService) {
        super(productService);
    }

}