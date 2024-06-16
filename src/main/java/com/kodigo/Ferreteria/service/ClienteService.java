package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteService{
    public List<ClienteEntity> listAllClientes();
    public ClienteEntity createCliente(ClienteEntity clienteEntity);
    public ClienteEntity updateCliente(ClienteEntity clienteEntity);
    public void deleteCliente(Integer id);

}
