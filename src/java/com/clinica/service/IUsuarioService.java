package com.clinica.service;

import com.clinica.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public void crearRegistro(Usuario usuario);
    public Usuario obtenerRegistro(long idUsuario);
    public void actualizararRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void eliminarRegistro(Usuario usuario);
}
