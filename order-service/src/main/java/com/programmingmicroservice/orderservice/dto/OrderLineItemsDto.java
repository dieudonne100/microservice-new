package com.programmingmicroservice.orderservice.dto;

import com.programmingmicroservice.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

    public static OrderLineItems toEntity(OrderLineItemsDto orderLineItemsDto) {
        if (orderLineItemsDto == null) {
            return null;
        }

        OrderLineItems order = new OrderLineItems();
        order.setPrice(orderLineItemsDto.getPrice());
        order.setQuantity(orderLineItemsDto.getQuantity());
        order.setSkuCode(orderLineItemsDto.getSkuCode());
        order.setId(orderLineItemsDto.getId());
        return order;
    }
}
