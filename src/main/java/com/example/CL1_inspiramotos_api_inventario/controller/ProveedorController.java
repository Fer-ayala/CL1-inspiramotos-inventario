package com.example.CL1_inspiramotos_api_inventario.controller;

import com.example.CL1_inspiramotos_api_inventario.model.Proveedor;
import com.example.CL1_inspiramotos_api_inventario.service.ProveedorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="apimotos/v1/proveedores")
public class ProveedorController {

    private ProveedorService proveedorService;

    @GetMapping("")
    public List<Proveedor> obtenerProveedores(){
        return proveedorService.listarProveedores();
    }

}
