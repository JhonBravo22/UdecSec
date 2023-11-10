package com.proyecto.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class juguetesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String marca;
    private String color;
    private Integer precio;

    public juguetesEntity() {
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public juguetesEntity(String nombre, String marca, String color, Integer precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "juguetesEntity [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", color=" + color + ", precio="
                + precio + "]";
    }
    
}
