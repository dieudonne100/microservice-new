package com.programmingmicroservice.inventoryservice.controller;
import com.programmingmicroservice.inventoryservice.controller.api.InventoryApi;
import com.programmingmicroservice.inventoryservice.dto.InventoryResponse;
import com.programmingmicroservice.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class InventoryController implements InventoryApi {

    private final InventoryService inventoryService;

    @Override
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }


}
