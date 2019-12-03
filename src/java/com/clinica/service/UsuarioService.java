package com.clinica.service;

import com.clinica.entity.Usuario;
import com.clinica.model.IUsuarioModel;
import com.clinica.model.UsuarioModelImp;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "usuarioService")
@ApplicationScoped
public class UsuarioService implements IUsuarioService {

    IUsuarioModel iUsuarioModel = new UsuarioModelImp();

    @Override
    public void crearRegistro(Usuario usuario) {
        iUsuarioModel.crearRegistro(usuario);
    }

    @Override
    public Usuario obtenerRegistro(long idUsuario) {
        return iUsuarioModel.obtenerRegistro(idUsuario);
    }

    @Override
    public void actualizararRegistro(Usuario usuario) {
        iUsuarioModel.actualizararRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return iUsuarioModel.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        iUsuarioModel.eliminarRegistro(usuario);
    }
}
