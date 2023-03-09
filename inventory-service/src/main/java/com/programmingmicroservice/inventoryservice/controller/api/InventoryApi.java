package com.programmingmicroservice.inventoryservice.controller.api;

import com.programmingmicroservice.inventoryservice.dto.InventoryResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static com.programmingmicroservice.inventoryservice.utils.Constants.API_ROOT;

public interface InventoryApi {
    @GetMapping(value = API_ROOT+"/inventory/{skucode}")
    @ResponseStatus(HttpStatus.OK)
    List<InventoryResponse> isInStock(@RequestParam List<String> skuCode);
}
