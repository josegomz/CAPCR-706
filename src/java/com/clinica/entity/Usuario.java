package com.clinica.entity;
// Generated 28/11/2019 01:53:43 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private long idusuario;
     private Rol rol;
     private String nombre;
     private String apellido;
     private String nombreusuario;
     private String contrasenia;

    public Usuario() {
    }

    public Usuario(long idusuario, Rol rol, String nombre, String apellido, String nombreusuario, String contrasenia) {
       this.idusuario = idusuario;
       this.rol = rol;
       this.nombre = nombre;
       this.apellido = apellido;
       this.nombreusuario = nombreusuario;
       this.contrasenia = contrasenia;
    }
   
    public long getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombreusuario() {
        return this.nombreusuario;
    }
    
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }




}


