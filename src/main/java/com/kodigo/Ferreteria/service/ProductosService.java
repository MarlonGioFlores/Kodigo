package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductosService {
    public List<ProductosEntity> listProductos();
    public ProductosEntity createProductos(ProductosEntity productosEntity);
    public ProductosEntity updateProductos(ProductosEntity productosEntity);
    public void deleteProductos(Integer id);
}
