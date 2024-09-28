package com.example.CL1_inspiramotos_api_inventario.service;

import com.example.CL1_inspiramotos_api_inventario.model.Proveedor;
import com.example.CL1_inspiramotos_api_inventario.repository.ProveedorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProveedorService implements IProveedorService{

    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }
}
