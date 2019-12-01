/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.service;

import com.clinica.entity.Practica;
import com.clinica.model.IPracticaModel;
import com.clinica.model.PracticaModelImp;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Uriel Gustavo Padilla Bustamante
 */
@ManagedBean(name = "practicaService")
@javax.faces.bean.ApplicationScoped
public class PracticaServiceImp implements IPracticaService{
    private IPracticaModel pm = new PracticaModelImp();

    @Override
    public List<Practica> obtenerRegistros() {
        return pm.obtenerRegistros();
    }

    @Override
    public Practica obtenerRegistro(String codigo) {
       return pm.obtenerRegistro(codigo);
    }

    @Override
    public void crearRegistro(Practica practica) {
       pm.crearRegistro(practica);
    }

    @Override
    public void eliminarRegistro(Practica practica) {
        pm.eliminarRegistro(practica);
    }

    @Override
    public void actualizarRegistro(Practica practica) {
        pm.actualizarRegistro(practica);
    }
}
