package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.TransaccionDao;
import com.kodigo.Ferreteria.entity.TransaccionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServicesImp implements TransaccionServices{

    @Autowired
    private TransaccionDao transaccionDao;
    @Override
    public List<TransaccionEntity> listTransaccion() {
        return transaccionDao.findAll();
    }

    @Override
    public TransaccionEntity createTransaccion(TransaccionEntity transaccionEntity) {
        return transaccionDao.save(transaccionEntity);
    }

    @Override
    public TransaccionEntity updateTransaccion() {
        return null;
    }

    @Override
    public void deleteTransaccion(Integer id) {
        transaccionDao.deleteById(id);
    }
}
