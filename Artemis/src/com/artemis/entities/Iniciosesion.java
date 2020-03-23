/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artemis.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roca12
 */
@Entity
@Table(name = "iniciosesion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Iniciosesion.findAll", query = "SELECT i FROM Iniciosesion i")
    , @NamedQuery(name = "Iniciosesion.findById", query = "SELECT i FROM Iniciosesion i WHERE i.id = :id")
    , @NamedQuery(name = "Iniciosesion.findByUsuario", query = "SELECT i FROM Iniciosesion i WHERE i.usuario = :usuario")
    , @NamedQuery(name = "Iniciosesion.findByFecha", query = "SELECT i FROM Iniciosesion i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Iniciosesion.findByHora", query = "SELECT i FROM Iniciosesion i WHERE i.hora = :hora")})
public class Iniciosesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;

    public Iniciosesion() {
    }

    public Iniciosesion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
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
        if (!(object instanceof Iniciosesion)) {
            return false;
        }
        Iniciosesion other = (Iniciosesion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.artemis.entities.Iniciosesion[ id=" + id + " ]";
    }
    
}
