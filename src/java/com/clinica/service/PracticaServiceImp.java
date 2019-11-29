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

/**
 *
 * @author labtw08
 */
public class PracticaServiceImp implements IPracticaService{
    private IPracticaModel pm = new PracticaModelImp();

    @Override
    public List<Practica> obtenerRegistros() {
        return pm.obtenerRegistros();
    }
}
