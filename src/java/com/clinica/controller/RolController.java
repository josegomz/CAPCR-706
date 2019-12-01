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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Josegomz
 */
@ManagedBean(name="rolBean")
@ViewScoped
public class RolController {
    @ManagedProperty("#{rolService}")
    private IRolService service;
    private Rol rol;
    private List<Rol> lista;
    
    @PostConstruct
    public void init(){
        rol = new Rol();
        this.lista = service.obtenerRegistros();
    }

    public List<Rol> getLista() {
        return lista;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setService(IRolService service) {
        this.service = service;
    }

    public void onRowEdit(RowEditEvent event){
        Rol rolSelected =((Rol) event.getObject());
        service.actualizarRegistro(rolSelected);
        FacesMessage mensaje = new FacesMessage("Registro Actualizado Correctamente",
                rolSelected.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
     public void onRowCancel(RowEditEvent event){
        FacesMessage mensaje = new FacesMessage("Actualización cancelada",
                ((Rol) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
    
     public void crearRegistro(){
         this.service.crearRegistro(rol);
     }
     
     public void actualizarRegistro(){
         this.service.actualizarRegistro(rol);
     }
     
     public void eliminarRegistro(){
         this.service.eliminarRegistro(rol);
     }
}
