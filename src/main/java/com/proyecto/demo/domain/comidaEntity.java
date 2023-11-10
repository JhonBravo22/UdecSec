package com.proyecto.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class comidaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String peso;
    private String marca;
    private String raza;
    private Integer precio;
    
    public comidaEntity() {
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public comidaEntity(String nombre, String peso, String marca, String raza, Integer precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.marca = marca;
        this.raza = raza;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "comidaEntity [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", marca=" + marca + ", raza="
                + raza + ", precio=" + precio + "]";
    }


}
