/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artemis.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roca12
 */
@Entity
@Table(name = "informacioncuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informacioncuenta.findAll", query = "SELECT i FROM Informacioncuenta i")
    , @NamedQuery(name = "Informacioncuenta.findById", query = "SELECT i FROM Informacioncuenta i WHERE i.id = :id")
    , @NamedQuery(name = "Informacioncuenta.findByUsername", query = "SELECT i FROM Informacioncuenta i WHERE i.username = :username")
    , @NamedQuery(name = "Informacioncuenta.findByPasswordkey", query = "SELECT i FROM Informacioncuenta i WHERE i.passwordkey = :passwordkey")
    , @NamedQuery(name = "Informacioncuenta.findByPersona", query = "SELECT i FROM Informacioncuenta i WHERE i.persona = :persona")
    , @NamedQuery(name = "Informacioncuenta.findByNombre", query = "SELECT i FROM Informacioncuenta i WHERE i.nombre = :nombre")})
public class Informacioncuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "passwordkey")
    private String passwordkey;
    @Column(name = "persona")
    private Integer persona;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    public Informacioncuenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordkey() {
        return passwordkey;
    }

    public void setPasswordkey(String passwordkey) {
        this.passwordkey = passwordkey;
    }

    public Integer getPersona() {
        return persona;
    }

    public void setPersona(Integer persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
