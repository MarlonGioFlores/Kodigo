package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.EmpleadoDao;
import com.kodigo.Ferreteria.entity.EmpleadoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImp implements EmpleadoService{
    @Autowired
    private EmpleadoDao empleadoDao;
    @Override
    public List<EmpleadoEntity> listAllEmpleados() {
        return empleadoDao.findAll();
    }

    @Override
    public EmpleadoEntity createEmpleado(EmpleadoEntity empleadoEntity) {
        return empleadoDao.save(empleadoEntity);
    }

    @Override
    public EmpleadoEntity updateEmpleado(EmpleadoEntity empleadoEntity) {
        return null;
    }

    @Override
    public void deleteEmpleado(Integer id) {
        empleadoDao.deleteById(id);
    }
}
