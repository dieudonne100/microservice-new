package com.programmingmicroservice.orderservice.service.impl;

import com.programmingmicroservice.orderservice.dto.OrderLineItemsDto;
import com.programmingmicroservice.orderservice.dto.OrderRequest;
import com.programmingmicroservice.orderservice.model.Order;
import com.programmingmicroservice.orderservice.model.OrderLineItems;
import com.programmingmicroservice.orderservice.repository.OrderRepository;
import com.programmingmicroservice.orderservice.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(OrderLineItemsDto::toEntity).toList();
        order.setOrderLineItems(orderLineItems);

        orderRepository.save(order);
    }




}
