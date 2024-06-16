package com.kodigo.Ferreteria.controller;

import com.kodigo.Ferreteria.service.TransaccionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    private TransaccionServices transaccionService;
}
