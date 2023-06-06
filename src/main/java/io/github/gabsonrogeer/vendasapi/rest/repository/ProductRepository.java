package io.github.gabsonrogeer.vendasapi.rest.repository;

import io.github.gabsonrogeer.vendasapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
