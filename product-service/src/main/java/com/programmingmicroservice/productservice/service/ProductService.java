package com.programmingmicroservice.productservice.service;

import com.programmingmicroservice.productservice.dto.ProductRequest;
import com.programmingmicroservice.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
