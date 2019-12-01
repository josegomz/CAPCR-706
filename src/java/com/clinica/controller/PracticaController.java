/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.entity.Practica;
import com.clinica.service.IPracticaService;
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
 * @author labtw08
 */
@ManagedBean(name="practicaBean")
@ViewScoped
public class PracticaController implements Serializable{
    @ManagedProperty("#{practicaService}")
    private IPracticaService service;
    private Practica practica;
    private  List<Practica> listaPractica;

    @PostConstruct
    public void init(){
        this.practica = new Practica();
        this.listaPractica= service.obtenerRegistros();
    }
    public IPracticaService getService() {
        return service;
    }

    public void setService(IPracticaService service) {
        this.service = service;
    }

    public Practica getPractica() {
        return practica;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }

    public List<Practica> getListaPractica() {
        return listaPractica;
    }

    public void setListaPractica(List<Practica> listaLiga) {
        this.listaPractica = listaLiga;
    }
    
    public void crearRegistro(){
        System.out.println("Creando Práctica");
        this.service.crearRegistro(practica);
    }
    public void eliminarRegistro(Practica practica){
        System.out.println("Eliminando Registro");
        this.service.eliminarRegistro(practica);
        this.listaPractica =service.obtenerRegistros();
    }
     public void onRowEdit(RowEditEvent event){
        Practica practicaSelected =((Practica) event.getObject());
        service.actualizarRegistro(practicaSelected);
        FacesMessage mensaje = new FacesMessage("Registro Actualizado Correctamente",
                practicaSelected.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
     public void onRowCancel(RowEditEvent event){
        FacesMessage mensaje = new FacesMessage("Actualización cancelada",
                ((Practica) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
    
}
