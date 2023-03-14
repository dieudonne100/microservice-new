package com.programmingmicroservice.inventoryservice.service;

import com.programmingmicroservice.inventoryservice.dto.InventoryResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface InventoryService {

    @Transactional(readOnly = true)
    List<InventoryResponse> isInStock(List<String> skuCode);
}
