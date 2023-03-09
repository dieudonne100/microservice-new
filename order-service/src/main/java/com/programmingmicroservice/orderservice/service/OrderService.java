package com.programmingmicroservice.orderservice.service;

import com.programmingmicroservice.orderservice.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
