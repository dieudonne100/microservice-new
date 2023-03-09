package com.programmingmicroservice.inventoryservice.service.impl;

import com.programmingmicroservice.inventoryservice.dto.InventoryResponse;
import com.programmingmicroservice.inventoryservice.repository.InventoryRepository;
import com.programmingmicroservice.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServicImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;

    @Override
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        log.info("Checking Inventory");
        return inventoryRepository.findBySkuCodeIn(skuCode).stream()
                .map(InventoryResponse::fromEntity
                ).toList();
    }


}