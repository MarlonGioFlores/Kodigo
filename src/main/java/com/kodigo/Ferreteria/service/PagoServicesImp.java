package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.PagoDao;
import com.kodigo.Ferreteria.entity.PagoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServicesImp implements PagoServices{
    @Autowired
    private PagoDao pagoDao;

    @Override
    public List<PagoEntity> listPago() {
        return pagoDao.findAll();
    }

    @Override
    public PagoEntity createPago(PagoEntity pagoEntity) {
        return pagoDao.save(pagoEntity);
    }

    @Override
    public PagoEntity updatePago(PagoEntity pagoEntity) {
        return null;
    }

    @Override
    public void deletePago(Integer id) {
        pagoDao.deleteById(id);
    }
}
