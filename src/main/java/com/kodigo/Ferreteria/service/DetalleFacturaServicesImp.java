package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.DetalleFacturaDao;
import com.kodigo.Ferreteria.entity.DetalleFacturaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServicesImp implements DetalleFacturaService{

    @Autowired
    private DetalleFacturaDao detalleFacturaDao;

    @Override
    public List<DetalleFacturaEntity> listDetalleFactura() {
        return detalleFacturaDao.findAll();
    }

    @Override
    public DetalleFacturaEntity createDetalleFactura(DetalleFacturaEntity detalleFacturaEntity) {
        return detalleFacturaDao.save(detalleFacturaEntity);
    }

    @Override
    public DetalleFacturaEntity updateDetalleFactura(DetalleFacturaEntity detalleFacturaEntity) {
        return null;
    }

    @Override
    public void deleteDetalleFactura(Integer id) {
        detalleFacturaDao.deleteById(id);
    }
}
