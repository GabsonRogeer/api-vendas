package io.github.gabsonrogeer.vendasapi.rest.products;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductFormRequest {

    private String description;
    private String name;
    private BigDecimal price;
    private String sku;

}
