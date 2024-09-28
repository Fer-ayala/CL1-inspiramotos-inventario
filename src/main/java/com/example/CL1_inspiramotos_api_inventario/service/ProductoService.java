package com.example.CL1_inspiramotos_api_inventario.service;

import com.example.CL1_inspiramotos_api_inventario.model.Producto;
import com.example.CL1_inspiramotos_api_inventario.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductoService implements IProductoService{

    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
}
