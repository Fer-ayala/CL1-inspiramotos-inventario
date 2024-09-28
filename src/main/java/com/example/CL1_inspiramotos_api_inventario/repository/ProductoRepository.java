package com.example.CL1_inspiramotos_api_inventario.repository;

import com.example.CL1_inspiramotos_api_inventario.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
