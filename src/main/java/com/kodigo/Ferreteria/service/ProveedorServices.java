package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.ProveedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedorServices  {
    public List<ProveedorEntity> listProveedor();
    public ProveedorEntity createProveedor(ProveedorEntity proveedorEntity);
    public ProveedorEntity updateProveedor(ProveedorEntity proveedorEntity);
    public void deleteProveedor(Integer id);
}
