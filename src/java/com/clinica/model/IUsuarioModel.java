package com.clinica.model;

import com.clinica.entity.Usuario;
import java.util.List;

/**
 *
 * @author macbookair
 */
public interface IUsuarioModel {
    public List<Usuario> obtenerUsuarios();
    public void crearRegistro(Usuario usuario);
    public Usuario obtenerRegistro(long idUsuario);
    public void actualizararRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public void eliminarRegistro(Usuario usuario);
}
