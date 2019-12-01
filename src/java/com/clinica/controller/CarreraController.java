/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.entity.Carrera;
import com.clinica.service.ICarreraService;
import java.io.Serializable;
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
 * @author macbookair
 */
@ManagedBean(name="carreraBean")
@ViewScoped
public class CarreraController implements Serializable{
      
    @ManagedProperty("#{carreraService}")
    private ICarreraService service;
    
    private Carrera carrera;
    private List<Carrera> lista;
    
    @PostConstruct
    public void init() {
        carrera = new Carrera();
        lista = service.obtenerRegistros();
    }

    public List<Carrera> getLista() {
        return lista;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setService(ICarreraService service) {
        this.service = service;
    }
    
    
    public void onRowEdit(RowEditEvent event) {
        Carrera carreraSelected = ((Carrera) event.getObject());
        service.actualizarRegistro(carreraSelected);
        FacesMessage mensaje = new FacesMessage("Registro Actualizado Correctamente",
                carreraSelected.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage mensaje = new FacesMessage("Actualización cancelada",
                ((Carrera) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void crearRegistro(){
        this.service.crearRegistro(carrera);
    }
    
    public void actualizarRegistro(){
        this.service.actualizarRegistro(carrera);
    }
    
    public void eliminarRegistro(){
        this.service.eliminarRegistro(carrera);
    }
    
}
