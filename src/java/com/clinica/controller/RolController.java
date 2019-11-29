/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.entity.Rol;
import com.clinica.service.IRolService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="rolBean")
@ViewScoped
public class RolController {
    @ManagedProperty("#{rolService}")
    private IRolService service;
    private Rol rol;
    private List<Rol> roles;
    
        @PostConstruct
    public void init(){
        rol = new Rol();
        this.roles = service.obtenerRegistros();
    }
}
