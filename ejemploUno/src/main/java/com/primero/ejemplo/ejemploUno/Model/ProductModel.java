package com.primero.ejemplo.ejemploUno.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

// @RequiredArgsConstructor
// @Data es una anotación que incluye otros como Getter y  Setter, es más general

@Builder
@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;
    private String password;

    // public ProductModel() { } no se requiere porque se usa la anotación @NoArgsConstructor

    /* Dejamos indicados estos getter para indicar que es una forma de hacerlo, pero no se requieren porque usamos las anotaciones para ello

    public Long getId() {return id;}
    public String getName() {return name;}
     */
}
