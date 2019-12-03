/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.model;

import com.clinica.entity.Carrera;
import java.util.List;

/**
 *
 * @author macbookair
 */
public interface ICarreraModel {
    public List<Carrera> obtenerRegistros();
    public Carrera obtenerRegistro(String codigo);
    public void crearRegistro(Carrera carrera);
    public void actualizarRegistro(Carrera carrera);
    public void eliminarRegistro(Carrera carrera);
}
