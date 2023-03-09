package com.programmingmicroservice.orderservice.controller;

import com.programmingmicroservice.orderservice.controller.api.OrderApi;
import com.programmingmicroservice.orderservice.dto.OrderRequest;
import com.programmingmicroservice.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderApi {
    private final OrderService orderService;

    @Override
    public String placeOrder(OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }

}
