/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.model;

import com.clinica.entity.Semestre;
import java.util.List;

/**
 *
 * @author macbookair
 */
public interface ISemestreModel {
    public List<Semestre> obtenerSemestres();
}
