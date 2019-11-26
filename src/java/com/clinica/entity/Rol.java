package com.clinica.entity;
// Generated 26/11/2019 07:51:05 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private long idrol;
     private String nombre;
     private Set usuarios = new HashSet(0);

    public Rol() {
    }

	
    public Rol(long idrol, String nombre) {
        this.idrol = idrol;
        this.nombre = nombre;
    }
    public Rol(long idrol, String nombre, Set usuarios) {
       this.idrol = idrol;
       this.nombre = nombre;
       this.usuarios = usuarios;
    }
   
    public long getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(long idrol) {
        this.idrol = idrol;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

