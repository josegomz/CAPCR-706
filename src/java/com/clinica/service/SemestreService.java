/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.service;

import com.clinica.entity.Semestre;
import com.clinica.model.ISemestreModel;
import com.clinica.model.SemestreModelImp;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author macbookair
 */
@ManagedBean(name="semestreService")
@ApplicationScoped
public class SemestreService implements ISemestreService{
    private final ISemestreModel sm = new SemestreModelImp();

    @Override
    public List<Semestre> obtenerRegistros() {
        return sm.obtenerRegistros();
    }

    @Override
    public Semestre obtenerRegistro(String codigo) {
        return sm.obtenerRegistro(codigo);
    }

    @Override
    public void crearRegistro(Semestre semestre) {
        sm.crearRegistro(semestre);
    }

    @Override
    public void actualizarRegistro(Semestre semestre) {
        sm.actualizarRegistro(semestre);
    }

    @Override
    public void eliminarRegistro(Semestre semestre) {
        sm.eliminarRegistro(semestre);
    }
    
    
}
