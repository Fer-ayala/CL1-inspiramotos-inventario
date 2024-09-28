package com.example.CL1_inspiramotos_api_inventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="productos")
public class Producto {
    @Id
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidad;
}
