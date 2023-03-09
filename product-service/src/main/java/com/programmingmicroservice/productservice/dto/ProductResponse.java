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
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public static ProductResponse fromEntity(Product product) {
        if (product == null) {
            return null;
        }
        return ProductResponse.builder()
                .price(product.getPrice())
                .name(product.getName())
                .description(product.getDescription())
                .id(product.getId())
                .build();
    }

    public Product toEntity(ProductResponse productResponse) {
        if (productResponse == null) {
            return null;
        }

        Product product = new Product();
        product.setId(productResponse.getId());
        product.setName(productResponse.getName());
        product.setDescription(productResponse.getDescription());
        product.setPrice(productResponse.getPrice());
        return product;


    }
}
