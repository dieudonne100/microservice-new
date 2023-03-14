package com.programmingmicroservice.orderservice.controller.api;

import com.programmingmicroservice.orderservice.dto.OrderRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.programmingmicroservice.orderservice.utils.Constants.API_ROOT;

public interface OrderApi {
    @PostMapping(value = API_ROOT + "/api/orders/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    String placeOrder(@RequestBody OrderRequest orderRequest);
}
