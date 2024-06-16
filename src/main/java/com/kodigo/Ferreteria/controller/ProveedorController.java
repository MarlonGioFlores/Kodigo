package com.kodigo.Ferreteria.controller;

import com.kodigo.Ferreteria.service.ProveedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorServices proveedorService;
}
