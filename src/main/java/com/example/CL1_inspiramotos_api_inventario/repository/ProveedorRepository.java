package com.example.CL1_inspiramotos_api_inventario.repository;

import com.example.CL1_inspiramotos_api_inventario.model.Producto;
import com.example.CL1_inspiramotos_api_inventario.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
