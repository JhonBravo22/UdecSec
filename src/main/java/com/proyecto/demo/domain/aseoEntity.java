package com.proyecto.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class aseoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String marca;
    private String especie;
    private Integer precio;

    public aseoEntity() {
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
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public aseoEntity(String nombre, String marca, String especie, Integer precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.especie = especie;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "aseoEntity [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", especie=" + especie + ", precio="
                + precio + "]";
    }
    
}
