package io.github.gabsonrogeer.vendasapi.rest.service;

import io.github.gabsonrogeer.vendasapi.model.Product;
import io.github.gabsonrogeer.vendasapi.model.dto.ProductDto;
import io.github.gabsonrogeer.vendasapi.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }
}
