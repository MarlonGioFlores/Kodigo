package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagoServices{
    public List<PagoEntity> listPago();
    public PagoEntity createPago(PagoEntity pagoEntity);
    public PagoEntity updatePago(PagoEntity pagoEntity);
    public void deletePago(Integer id);
}
