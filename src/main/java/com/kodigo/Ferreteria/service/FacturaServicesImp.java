package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.FacturaDao;
import com.kodigo.Ferreteria.entity.FacturaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServicesImp implements FacturaService{
    @Autowired
    private FacturaDao facturaDao;
    @Override
    public List<FacturaEntity> listFactura() {
        return facturaDao.findAll();
    }

    @Override
    public FacturaEntity createFactura(FacturaEntity facturaEntity) {
        return facturaDao.save(facturaEntity);
    }

    @Override
    public FacturaEntity updateFactura(FacturaEntity facturaEntity) {
        return null;
    }

    @Override
    public void deleteFactura(Integer id) {
        facturaDao.deleteById(id);
    }
}
