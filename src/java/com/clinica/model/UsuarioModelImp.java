package com.clinica.model;

import com.clinica.entity.Rol;
import com.clinica.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author macbookair
 */
public class UsuarioModelImp implements IUsuarioModel {

    SessionFactory sessionFactory = null;
    Session session = null;

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> Lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            Lista = session.createQuery("FROM Usuario").list();
            for (Usuario l : Lista) {
                System.out.println("Nombre: " + l.getNombre());
            }
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e + "Errores");
            System.out.println("Error");
        }
        return Lista;
    }

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Usuario obtenerRegistro(long idUsuario) {
        Usuario usuario = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            usuario = (Usuario) session.get(Usuario.class, idUsuario);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }

    @Override
    public void actualizararRegistro(Usuario usuario) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        ArrayList<Usuario> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<Usuario>) session.createQuery("FROM Usuario").list();
            for (Usuario l : lista) {
                System.out.println("Nombre: " + l.getNombre());
            }
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(usuario);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        IUsuarioModel um = new UsuarioModelImp();
        System.out.println("******Todos los usuarios********");
        um.obtenerUsuarios();
        
    }

}
