package com.kodigo.Ferreteria.dao;

import com.kodigo.Ferreteria.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<CategoriaEntity, Integer> {
}
