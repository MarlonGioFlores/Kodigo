package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadoService{
    public List<EmpleadoEntity> listAllEmpleados();
    public EmpleadoEntity createEmpleado(EmpleadoEntity empleadoEntity);
    public EmpleadoEntity updateEmpleado(EmpleadoEntity empleadoEntity);
    public void deleteEmpleado(Integer id);
}
