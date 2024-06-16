package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.TiposTransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TiposTransaccionService {
    public List<TiposTransaccionEntity> listTiposTransaccion();
    public TiposTransaccionEntity createTiposTransaccion(TiposTransaccionEntity tiposTransaccionEntity);
    public TiposTransaccionEntity updateTiposTransaccion(TiposTransaccionEntity tiposTransaccionEntity);
    public void deleteTiposTransaccion(Integer id);
}
