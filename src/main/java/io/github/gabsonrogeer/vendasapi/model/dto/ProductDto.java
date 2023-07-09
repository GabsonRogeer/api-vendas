package io.github.gabsonrogeer.vendasapi.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ProductDto {

    private Long id;
    private String description;
    private String name;
    private BigDecimal price;
    private String sku;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate registrationDate;
}
