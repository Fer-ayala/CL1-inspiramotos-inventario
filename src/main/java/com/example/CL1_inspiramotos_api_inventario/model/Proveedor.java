package com.example.CL1_inspiramotos_api_inventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="proveedores")
public class Proveedor {
    @Id
    private int idProveedor;
    private String nombreProveedor;
    private String contacto;
    private String direccion;
}
