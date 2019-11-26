/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.entity.Practica;
import com.clinica.service.IPracticaService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

/**
 *
 * @author labtw08
 */
@ManagedBean(name ="vistaUsuarios")
@ViewScoped
public class PracticaController {
    private List<Practica> Practicas;
    private Practica practica;
    
    @ManagedProperty("#{practicaService}")
    private IPracticaService service;

    public Practica getPractica() {
        return practica;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }
    
    @PostConstruct
    public void init() {
        this.Practicas=service.obtenerPracticas();
        practica = new Practica();
    }

    public List<Practica> getPracticas() {
        return Practicas;
    }

    public void setService(IPracticaService service) {
        this.service = service;
    }
    
}
