/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.service;

import com.clinica.entity.Rol;
import java.util.List;

/**
 *
 * @author Josegomz
 */
public interface IRolService {

    public List<Rol> obtenerRegistros();

    public void crearRegistro(Rol rol);

    public void actualizarRegistro(Rol rol);

    public void eliminarRegistro(Rol rol);

    public Rol obtenerRegistro(Long idRol);
}
