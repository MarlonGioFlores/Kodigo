package com.kodigo.Ferreteria.controller;

import com.kodigo.Ferreteria.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductosContoller {

    @Autowired
    private ProductosService productosService;
}
