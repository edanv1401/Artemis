package com.artemis.service;


import com.artemis.entities.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ServicePersona {

    public void crearNuevaPersona(String nombre) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        entitymanager.getTransaction().begin();
        Persona p = new Persona();
        p.setDocumento(null);
        p.setNombre(nombre);
        entitymanager.persist(p);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    public void actualizarPersona(Integer id, String nombre) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        entitymanager.getTransaction().begin();
        Persona p = entitymanager.find(Persona.class, id);
        p.setNombre(nombre);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    public Persona buscarPersona() {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Persona p = entitymanager.find(Persona.class, 2);
        return p;
    }

    public void eliminarPersona(Integer id) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        entitymanager.getTransaction().begin();
        Persona p = entitymanager.find(Persona.class, id);
        entitymanager.remove(p);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    public List<Persona> buscarTodosPersona() {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Query q = entitymanager.createQuery("select p from Persona p");
        List<Persona> list = (List<Persona>) q.getResultList();
        return list;
    }

    public List<Persona> buscarTodosPersonaPorNombre(String nombre) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Query q = entitymanager.createQuery("select p from Persona p"
                + " where p.nombre like :nom");
        q.setParameter("nom", nombre + "%");
        List<Persona> list = (List<Persona>) q.getResultList();
        return list;
    }

    public List<Persona> buscarTodosPersonaPorIdRango(Integer a, Integer b) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Query q = entitymanager.createQuery("select p from Persona p"
                + " where p.documento between :a and :b ");
        q.setParameter("a", a);
        q.setParameter("b", b);
        List<Persona> list = (List<Persona>) q.getResultList();
        return list;

    }

    public List<Persona> buscarPersonaNombreIgual(String nombre) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Query q = entitymanager.createQuery("select p from Persona p"
                + " where p.nombre = :nom");
        q.setParameter("nom", nombre);
        List<Persona> list = (List<Persona>) q.getResultList();
        return list;
    }

}
