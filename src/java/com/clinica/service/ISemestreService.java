/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.service;

import com.clinica.entity.Semestre;
import java.util.List;

/**
 *
 * @author macbookair
 */
public interface ISemestreService {
    public List<Semestre> obtenerSemestres();
    public Semestre obtenerRegistro(String codigo);
    public void crearRegistro(Semestre semestre);
    public void actualizarRegistro(Semestre semestre);
    public void eliminarRegistro(Semestre semestre);
}
