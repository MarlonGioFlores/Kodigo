package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.DetalleFacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleFacturaService {
    public List<DetalleFacturaEntity> listDetalleFactura();
    public DetalleFacturaEntity createDetalleFactura(DetalleFacturaEntity detalleFacturaEntity);
    public DetalleFacturaEntity updateDetalleFactura(DetalleFacturaEntity detalleFacturaEntity);
    public void deleteDetalleFactura(Integer id);
}
