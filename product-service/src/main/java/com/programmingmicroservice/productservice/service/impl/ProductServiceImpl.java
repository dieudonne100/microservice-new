package com.programmingmicroservice.productservice.service.impl;

import com.programmingmicroservice.productservice.dto.ProductRequest;
import com.programmingmicroservice.productservice.dto.ProductResponse;
import com.programmingmicroservice.productservice.model.Product;
import com.programmingmicroservice.productservice.repository.ProductRepository;
import com.programmingmicroservice.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {
        productRepository.save(ProductRequest.toEntity(productRequest));
        log.info("Product {} is saved ", productRequest.getId());
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products
                .stream()
                .map(ProductResponse::fromEntity)
                .collect(Collectors.toList());
    }


}
