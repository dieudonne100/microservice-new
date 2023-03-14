package com.programmingmicroservice.productservice.controller;

import com.programmingmicroservice.productservice.controller.api.ProductApi;
import com.programmingmicroservice.productservice.dto.ProductRequest;
import com.programmingmicroservice.productservice.dto.ProductResponse;
import com.programmingmicroservice.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {

    private final ProductService productService;

    @Override
    public void createProduct(ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

}
