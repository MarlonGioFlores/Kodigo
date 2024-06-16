package com.kodigo.Ferreteria.dao;

import com.kodigo.Ferreteria.entity.DetalleFacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaDao extends JpaRepository<DetalleFacturaEntity, Integer> {
}
