package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransaccionServices  {
    public List<TransaccionEntity> listTransaccion();
    public TransaccionEntity createTransaccion(TransaccionEntity transaccionEntity);
    public TransaccionEntity updateTransaccion();
    public void deleteTransaccion(Integer id);
}
