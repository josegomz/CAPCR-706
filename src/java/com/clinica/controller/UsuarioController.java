package com.clinica.controller;

import com.clinica.entity.Usuario;
import com.clinica.service.IUsuarioService;
import com.clinica.service.UsuarioService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.event.RowEditEvent;

@ManagedBean(name = "usuarioBean")
@ViewScoped
public class UsuarioController implements Serializable{

   @ManagedProperty("#{usuarioService}")
    private IUsuarioService service;

    private List<Usuario> listaUsuario;
    private Usuario usuario;

    @PostConstruct
    public void init() {
        usuario = new Usuario();
        service = new UsuarioService();
        listaUsuario = service.obtenerRegistros();
    }

     //CRUD
    public void crearRegistro() {
        System.out.println("Mensaje recibido");
        this.service.crearRegistro(usuario);
    }
    
    public void eliminarRegistro(Usuario usuario) {
        service.eliminarRegistro(usuario);
        this.listaUsuario = service.obtenerRegistros();
    }
    
    public String mostrarRol(Long idrol) {
        if(idrol == 1){
            return "Admin";
        }
        else{
            return "super";
        }
    }
    
    public void onRowEdit(RowEditEvent event) {
        System.out.println("----->");
        Usuario usuarioSelected = ((Usuario) event.getObject());
        service.actualizararRegistro(usuarioSelected);
        FacesMessage mensaje = new FacesMessage("Actualización procesada",usuarioSelected.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Actualización cancelada",((Usuario) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    
    //Getters and Setters

    public IUsuarioService getService() {
        return service;
    }

    public void setService(IUsuarioService service) {
        this.service = service;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}