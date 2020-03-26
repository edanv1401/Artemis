package com.artemis.service;

import com.artemis.entities.Cuentausuario;
import com.artemis.entities.Persona;
import com.artemis.util.AES;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author roca12
 */
public class ServiceCuentaUsuario {

    AES aes = new AES();
    final String key1 = "shadow";

    public void crearNuevoCuentaUsuario(String nombre, String pass, Persona persona) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        entitymanager.getTransaction().begin();
        Cuentausuario cu = new Cuentausuario();
        cu.setId(null);
        cu.setUsername(aes.encrypt(nombre, key1));
        cu.setPasswordkey(aes.encrypt(pass, key1));
        cu.setPersona(persona);
        entitymanager.persist(cu);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    public void actualizarCuentaUsuario(Integer id, String pass) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        entitymanager.getTransaction().begin();
        Cuentausuario cu = entitymanager.find(Cuentausuario.class, id);
        cu.setPasswordkey(aes.encrypt(pass, key1));
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    public Cuentausuario buscarCuentaUsuario(int id) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Cuentausuario cu = entitymanager.find(Cuentausuario.class, id);
        cu.setPasswordkey(aes.decrypt(cu.getPasswordkey(), key1));
        cu.setUsername(aes.decrypt(cu.getUsername(), key1));
        return cu;
    }

    public void eliminarCuentaUsuario(Integer id) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        entitymanager.getTransaction().begin();
        Cuentausuario cu = entitymanager.find(Cuentausuario.class, id);
        entitymanager.remove(cu);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    public Cuentausuario buscarCuentausuarioNombreIgual(String user) {
        EntityManager entitymanager = Persistence.createEntityManagerFactory("LoginPU").createEntityManager();
        Query q = entitymanager.createQuery("select c from Cuentausuario c"
                + " where c.username = :nom");
        q.setParameter("nom", user);
        Cuentausuario cu = (Cuentausuario) q.getSingleResult();
        return cu;
    }
}
