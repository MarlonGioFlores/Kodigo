package com.kodigo.Ferreteria.dao;

import com.kodigo.Ferreteria.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<ClienteEntity, Integer> {
}
