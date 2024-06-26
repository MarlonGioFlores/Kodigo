package com.kodigo.Ferreteria.Service;

import com.kodigo.Ferreteria.entity.TransaccionEntity;

import java.util.List;

public interface TransaccionService {
    public List<TransaccionEntity> listTransaccion();
    public TransaccionEntity createTransaccion(TransaccionEntity transaccionEntity);
    public TransaccionEntity updateTransaccion();
    public void deleteTransaccion(Integer id);
}
