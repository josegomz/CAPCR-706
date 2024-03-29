package com.clinica.model;

import com.clinica.entity.Alumno;
import java.util.List;

public interface IAlumnoModel {
    public void crearRegistro(Alumno alumno);
    public Alumno obtenerRegistro(long idAlumno);
    public void actualizararRegistro(Alumno alumno);
    public List<Alumno> obtenerRegistros();
    public void eliminarRegistro(Alumno alumno);
}
