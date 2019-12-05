package com.clinica.entity;
// Generated 28/11/2019 01:53:43 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Practica generated by hbm2java
 */
public class Practica  implements java.io.Serializable {


     private String codigo;
     private Carrera carrera;
     private Semestre semestre;
     private String nombre;
     private Date fechacreacion;
     private Date fechaactualizacion;
     private Date fechaeliminacion;
     private Set registros = new HashSet(0);

    public Practica() {
    }

	
    public Practica(String codigo, Carrera carrera, Semestre semestre, String nombre, Date fechacreacion) {
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
        this.nombre = nombre;
        this.fechacreacion = fechacreacion;
    }
    public Practica(String codigo, Carrera carrera, Semestre semestre, String nombre, Date fechacreacion, Date fechaactualizacion, Date fechaeliminacion, Set registros) {
       this.codigo = codigo;
       this.carrera = carrera;
       this.semestre = semestre;
       this.nombre = nombre;
       this.fechacreacion = fechacreacion;
       this.fechaactualizacion = fechaactualizacion;
       this.fechaeliminacion = fechaeliminacion;
       this.registros = registros;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Carrera getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public Semestre getSemestre() {
        return this.semestre;
    }
    
    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechacreacion() {
        return this.fechacreacion;
    }
    
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    public Date getFechaactualizacion() {
        return this.fechaactualizacion;
    }
    
    public void setFechaactualizacion(Date fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }
    public Date getFechaeliminacion() {
        return this.fechaeliminacion;
    }
    
    public void setFechaeliminacion(Date fechaeliminacion) {
        this.fechaeliminacion = fechaeliminacion;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}

