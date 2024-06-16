package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaService  {
    public List<PersonaEntity> listarPersonas();
    public PersonaEntity createPersona(PersonaEntity persona);
    public PersonaEntity updatePersona(PersonaEntity persona);
    public void deletePersona(Integer id);
}
