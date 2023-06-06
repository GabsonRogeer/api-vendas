package io.github.gabsonrogeer.vendasapi.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_product")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String description;
    @Column(length = 100)
    private String name;
    @Column(name = "price", precision = 16, scale = 2)
    private BigDecimal price;
    @Column(length = 255)
    private String sku;
}
