package com.programmingmicroservice.productservice.repository;

import com.programmingmicroservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
