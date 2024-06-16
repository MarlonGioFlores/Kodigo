package com.kodigo.Ferreteria.dao;

import com.kodigo.Ferreteria.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDao extends JpaRepository<EmpleadoEntity, Integer> {
}
