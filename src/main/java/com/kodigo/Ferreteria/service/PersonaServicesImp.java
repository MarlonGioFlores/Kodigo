package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.PersonaDao;
import com.kodigo.Ferreteria.entity.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicesImp implements PersonaService{
    @Autowired
    public PersonaDao personaDao;

    @Override
    public List<PersonaEntity> listarPersonas() {
        return personaDao.findAll();
    }

    @Override
    public PersonaEntity createPersona(PersonaEntity persona) {
        return personaDao.save(persona);
    }

    @Override
    public PersonaEntity updatePersona(PersonaEntity persona) {
        return null;
    }

    @Override
    public void deletePersona(Integer id) {
        personaDao.deleteById(id);
    }
}
