/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.service;

import com.clinica.entity.Rol;
import com.clinica.model.IRolModel;
import com.clinica.model.RolModelImp;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="rolService")
@ApplicationScoped
public class RolService implements IRolService{
    private final IRolModel rm = new RolModelImp();

    @Override
    public List<Rol> obtenerRegistros() {
        return rm.obtenerRegistros();
    }

    @Override
    public void crearRegistro(Rol rol) {
        rm.crearRegistro(rol);
    }

    @Override
    public void actualizarRegistro(Rol rol) {
        rm.actualizarRegistro(rol);
    }

    @Override
    public void eliminarRegistro(Rol rol) {
        rm.eliminarRegistro(rol);
    }

    @Override
    public Rol obtenerRegistro(Long idRol) {
        return rm.obtenerRegistro(idRol);
    }
    
}
