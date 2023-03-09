package com.programmingmicroservice.inventoryservice.dto;

import com.programmingmicroservice.inventoryservice.model.Inventory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;

    public static InventoryResponse fromEntity(Inventory inventory) {
        if (inventory==null) {
            return null;
        }

      return  InventoryResponse.builder()
              .skuCode(inventory.getSkuCode())
              .isInStock(inventory.getQuantity() > 0)
              .build();

    }
}