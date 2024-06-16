package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.TiposPagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TiposPagoService  {
    public List<TiposPagoEntity> listTiposPago();
    public TiposPagoEntity createTiposPago(TiposPagoEntity tiposPagoEntity);
    public TiposPagoEntity updateTiposPago(TiposPagoEntity tiposPagoEntity);
    public void deleteTiposPago(Integer id);
}
