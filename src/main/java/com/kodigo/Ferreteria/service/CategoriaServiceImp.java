package com.kodigo.Ferreteria.service;

import com.kodigo.Ferreteria.dao.CategoriaDao;
import com.kodigo.Ferreteria.entity.CategoriaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImp implements CategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<CategoriaEntity> listCategoria() {
        return categoriaDao.findAll();
    }

    @Override
    public CategoriaEntity creatCategoria(CategoriaEntity categoriaEntity) {
        return categoriaDao.save(categoriaEntity);
    }

    @Override
    public CategoriaEntity updateCategoria(CategoriaEntity categoriaEntity) {
        return null;
    }

    @Override
    public void deleteCategoria(Integer id) {
        categoriaDao.deleteById(id);
    }
}
