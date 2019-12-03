/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.service;

import com.clinica.entity.Carrera;
import com.clinica.model.CarreraModelImp;
import com.clinica.model.ICarreraModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author macbookair
 */
@ManagedBean(name="carreraService")
@ApplicationScoped
public class CarreraService  implements ICarreraService{
    private final ICarreraModel cm = new CarreraModelImp();

    @Override
    public List<Carrera> obtenerRegistros() {
        return cm.obtenerRegistros();
    }

    @Override
    public Carrera obtenerRegistro(String codigo) {
        return cm.obtenerRegistro(codigo);
    }

    @Override
    public void crearRegistro(Carrera carrera) {
        cm.crearRegistro(carrera);
    }

    @Override
    public void actualizarRegistro(Carrera carrera) {
        cm.actualizarRegistro(carrera);
    }

    @Override
    public void eliminarRegistro(Carrera carrera) {
        cm.eliminarRegistro(carrera);
    }
}
