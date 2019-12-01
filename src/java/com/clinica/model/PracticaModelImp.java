/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.model;

import com.clinica.entity.Practica;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author macbookair
 */
public class PracticaModelImp implements IPracticaModel {

    SessionFactory sessionFactory = null;
    Session session = null;

    @Override
    public List<Practica> obtenerRegistros() {
        List<Practica> Lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            Lista = session.createQuery("FROM Practica").list();
            for (Practica l : Lista) {
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
    public Practica obtenerRegistro(String codigo) {
        Practica practica = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            practica = (Practica) session.get(Practica.class, codigo);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return practica;
    }

    @Override
    public void crearRegistro(Practica practica) {
         try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(practica);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminarRegistro(Practica practica) {
         try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(practica);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e);
        }
    }

    @Override
    public void actualizarRegistro(Practica practica) {
      try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(practica);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e);
        }
    }
    
      public static void main(String[] args) {
        IPracticaModel pm = new PracticaModelImp();
        //System.out.println(pm.obtenerRegistros());
        //System.out.println((pm.obtenerRegistro("3003")).getNombre());
        
    }
}
