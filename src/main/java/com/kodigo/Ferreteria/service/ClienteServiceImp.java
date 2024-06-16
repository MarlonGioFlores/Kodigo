package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.ClienteDao;
import com.kodigo.Ferreteria.entity.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;
    @Override
    public List<ClienteEntity> listAllClientes() {
        return clienteDao.findAll();
    }

    @Override
    public ClienteEntity createCliente(ClienteEntity clienteEntity) {
        return clienteDao.save(clienteEntity);
    }

    @Override
    public ClienteEntity updateCliente(ClienteEntity clienteEntity) {
        return null;
    }

    @Override
    public void deleteCliente(Integer id) {
        clienteDao.deleteById(id);
    }
}
