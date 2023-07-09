package io.github.gabsonrogeer.vendasapi.rest.controller;

import io.github.gabsonrogeer.vendasapi.model.Product;
import io.github.gabsonrogeer.vendasapi.model.dto.ProductDto;
import io.github.gabsonrogeer.vendasapi.rest.repository.ProductRepository;
import io.github.gabsonrogeer.vendasapi.rest.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProductsController {

    @Autowired
    ProductService service;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto ){
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        service.saveProduct(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<List<Product>> findAll(){
        List<Product> products = service.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


}
