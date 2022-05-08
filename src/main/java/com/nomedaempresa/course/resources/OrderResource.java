package com.nomedaempresa.course.resources;

import com.nomedaempresa.course.entities.Order;
import com.nomedaempresa.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource extends BaseResource<Order> {

    @Autowired
    public OrderResource(OrderService orderService) {
        super(orderService);
    }

}