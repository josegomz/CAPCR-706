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
 * @author labtw08
 */
@ManagedBean(name = "practicaService")
@javax.faces.bean.ApplicationScoped
public class PracticaService implements IPracticaService{
    IPracticaModel pm = new PracticaModelImp();

    @Override
    public List<Practica> obtenerPracticas() {
        return pm.obtenerPracticas();
    }
    
}
