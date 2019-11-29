/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.model;

import com.clinica.entity.Rol;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author macbookair
 */
public class RolModelImp implements IRolModel{

    SessionFactory sessionFactory = null;
    Session session = null;
    
    @Override
    public List<Rol> obtenerRoles() {
                List<Rol> Lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            Lista = session.createQuery("FROM Rol").list();
            for (Rol l : Lista) {
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
    
    public static void main(String[] args) {
        IRolModel rm = new RolModelImp();
        System.out.println(rm.obtenerRoles());
    }
    
}
