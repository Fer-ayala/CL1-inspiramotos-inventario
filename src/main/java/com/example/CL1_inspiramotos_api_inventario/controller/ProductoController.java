package com.example.CL1_inspiramotos_api_inventario.controller;

import com.example.CL1_inspiramotos_api_inventario.model.Producto;
import com.example.CL1_inspiramotos_api_inventario.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="apimotos/v1/productos")
public class ProductoController {

    private ProductoService productoService;

    @GetMapping("")
    public List<Producto> obtenerProductos(){
        return productoService.listarProductos();
    }

}
