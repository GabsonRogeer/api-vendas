package io.github.gabsonrogeer.vendasapi.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {

    private String description;
    private String name;
    private BigDecimal price;
    private String sku;
}
