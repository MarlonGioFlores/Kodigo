package com.kodigo.Ferreteria.controller;

import com.kodigo.Ferreteria.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")

public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;
}
