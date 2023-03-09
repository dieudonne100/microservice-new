package com.programmingmicroservice.productservice.dto;

import com.programmingmicroservice.productservice.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public static ProductRequest fromEntity(Product product) {
        if (product==null){
            return null;
        }
        return ProductRequest.builder()
                .price(product.getPrice())
                .name(product.getName())
                .description(product.getDescription())
                .id(product.getId())
                .build();
    }

    public static Product toEntity(ProductRequest productRequest) {
        if (productRequest==null){
            return null;
        }

        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setId(productRequest.getId());
        product.setPrice(productRequest.getPrice());
        return product;
    }
}
