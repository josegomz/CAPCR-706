package com.clinica.service;

import com.clinica.entity.Alumno;
import com.clinica.model.AlumnoModelImp;
import com.clinica.model.IAlumnoModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "alumnoService")
@ApplicationScoped
public class AlumnoService implements IAlumnoService{
    IAlumnoModel iAlumnoModel = new AlumnoModelImp();

    @Override
    public void crearRegistro(Alumno alumno) {
        iAlumnoModel.crearRegistro(alumno);
    }

    @Override
    public Alumno obtenerRegistro(long idAlumno) {
        return iAlumnoModel.obtenerRegistro(idAlumno);
    }

    @Override
    public void actualizararRegistro(Alumno alumno) {
        iAlumnoModel.actualizararRegistro(alumno);
    }

    @Override
    public List<Alumno> obtenerRegistros() {
        return iAlumnoModel.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Alumno alumno) {
        iAlumnoModel.eliminarRegistro(alumno);
    }
}
