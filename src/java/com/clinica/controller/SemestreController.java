/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.entity.Semestre;
import com.clinica.service.ISemestreService;
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
@ManagedBean(name = "semestreBean")
@ViewScoped
public class SemestreController {

    @ManagedProperty("#{semestreService}")
    private ISemestreService service;
    private Semestre semestre;
    private List<Semestre> lista;

    @PostConstruct
    public void init() {
        semestre = new Semestre();
        lista = service.obtenerRegistros();
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public List<Semestre> getLista() {
        return lista;
    }

    public void setService(ISemestreService service) {
        this.service = service;
    }

    public void onRowEdit(RowEditEvent event) {
        Semestre semestreSelected = ((Semestre) event.getObject());
        service.actualizarRegistro(semestreSelected);
        FacesMessage mensaje = new FacesMessage("Registro Actualizado Correctamente",
                semestreSelected.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage mensaje = new FacesMessage("Actualización cancelada",
                ((Semestre) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void crearRegistro() {
        this.service.crearRegistro(semestre);
        FacesMessage mensaje = new FacesMessage("Semestre creado exitosamente", semestre.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);

    }

    public void actualizarRegistro() {
        this.service.actualizarRegistro(semestre);
        FacesMessage mensaje = new FacesMessage("Semestre actualizado exitosamente", semestre.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void eliminarRegistro(Semestre semestre) {
        this.service.eliminarRegistro(semestre);
        FacesMessage mensaje = new FacesMessage("Semestre eliminado exitosamente", semestre.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
}
