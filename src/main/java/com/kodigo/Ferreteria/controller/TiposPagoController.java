package com.kodigo.Ferreteria.controller;

import com.kodigo.Ferreteria.service.TiposPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tiposPago")
public class TiposPagoController {

    @Autowired
    private TiposPagoService tiposPagoService;
}
