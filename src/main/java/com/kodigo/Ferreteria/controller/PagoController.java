package com.kodigo.Ferreteria.controller;

import com.kodigo.Ferreteria.service.PagoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private PagoServices pagoService;
}
