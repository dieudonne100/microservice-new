package com.programmingmicroservice.productservice.controller.api;

import com.programmingmicroservice.productservice.dto.ProductRequest;
import com.programmingmicroservice.productservice.dto.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static com.programmingmicroservice.productservice.utils.Constants.API_ROOT;

public interface ProductApi {


    @PostMapping(value = API_ROOT + "/api/product/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void createProduct(@RequestBody ProductRequest productRequest);


    @GetMapping(value = API_ROOT + "/api/product/productlist", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<ProductResponse> getAllProducts();
}
