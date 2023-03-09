package com.programmingmicroservice.inventoryservice.service;

import com.programmingmicroservice.inventoryservice.dto.InventoryResponse;
import com.programmingmicroservice.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface InventoryService {

    @Transactional(readOnly = true)
    @SneakyThrows
    List<InventoryResponse> isInStock(List<String> skuCode);
}
