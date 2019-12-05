package com.clinica.controller;

import com.clinica.entity.Alumno;
import com.clinica.service.AlumnoService;
import com.clinica.service.IAlumnoService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "alumnoBean")
@ViewScoped
public class AlumnoController implements Serializable {
    //@ManagedProperty("#{ligaService}")

    private IAlumnoService service;

    private List<Alumno> listaAlumno;
    private Alumno alumno;

    @PostConstruct
    public void init() {
        alumno = new Alumno();
        service = new AlumnoService();
        listaAlumno = service.obtenerRegistros();
    }

    //CRUD
    public void crearRegistro() {
        System.out.println("Mensaje recibido");
        this.service.crearRegistro(alumno);
    }

    public void eliminarRegistro(Alumno alumno) {
        service.eliminarRegistro(alumno);
        this.listaAlumno = service.obtenerRegistros();
    }

    public void onRowEdit(RowEditEvent event) {
        Alumno ligaSelected = ((Alumno) event.getObject());
        service.actualizararRegistro(ligaSelected);
        FacesMessage mensaje = new FacesMessage("Actualización procesada", ligaSelected.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Actualización cancelada", ((Alumno) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    //Getters and Setters
    public IAlumnoService getService() {
        return service;
    }

    public void setService(IAlumnoService service) {
        this.service = service;
    }

    public List<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(List<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
