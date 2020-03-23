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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "cuentausuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentausuario.findAll", query = "SELECT c FROM Cuentausuario c")
    , @NamedQuery(name = "Cuentausuario.findById", query = "SELECT c FROM Cuentausuario c WHERE c.id = :id")
    , @NamedQuery(name = "Cuentausuario.findByUsername", query = "SELECT c FROM Cuentausuario c WHERE c.username = :username")
    , @NamedQuery(name = "Cuentausuario.findByPasswordkey", query = "SELECT c FROM Cuentausuario c WHERE c.passwordkey = :passwordkey")
    , @NamedQuery(name = "Cuentausuario.findByPersona", query = "SELECT c FROM Cuentausuario c WHERE c.persona = :persona")})
public class Cuentausuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "passwordkey")
    private String passwordkey;
    @Column(name = "persona")
    private Integer persona;

    public Cuentausuario() {
    }

    public Cuentausuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentausuario)) {
            return false;
        }
        Cuentausuario other = (Cuentausuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.artemis.entities.Cuentausuario[ id=" + id + " ]";
    }
    
}
