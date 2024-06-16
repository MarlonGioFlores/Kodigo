package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.TiposTransaccionDao;
import com.kodigo.Ferreteria.entity.TiposTransaccionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposTransaccionServicesImp implements TiposTransaccionService{
    @Autowired
    private TiposTransaccionDao tiposTransaccionDao;
    @Override
    public List<TiposTransaccionEntity> listTiposTransaccion() {
        return tiposTransaccionDao.findAll();
    }

    @Override
    public TiposTransaccionEntity createTiposTransaccion(TiposTransaccionEntity tiposTransaccionEntity) {
        return tiposTransaccionDao.save(tiposTransaccionEntity);
    }

    @Override
    public TiposTransaccionEntity updateTiposTransaccion(TiposTransaccionEntity tiposTransaccionEntity) {
        return null;
    }

    @Override
    public void deleteTiposTransaccion(Integer id) {
        tiposTransaccionDao.deleteById(id);
    }
}
