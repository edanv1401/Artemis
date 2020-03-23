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
@Table(name = "auditoriaartemis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoriaartemis.findAll", query = "SELECT a FROM Auditoriaartemis a")
    , @NamedQuery(name = "Auditoriaartemis.findById", query = "SELECT a FROM Auditoriaartemis a WHERE a.id = :id")
    , @NamedQuery(name = "Auditoriaartemis.findByFecha", query = "SELECT a FROM Auditoriaartemis a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Auditoriaartemis.findByHora", query = "SELECT a FROM Auditoriaartemis a WHERE a.hora = :hora")
    , @NamedQuery(name = "Auditoriaartemis.findByUsuario", query = "SELECT a FROM Auditoriaartemis a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "Auditoriaartemis.findByNombreTabla", query = "SELECT a FROM Auditoriaartemis a WHERE a.nombreTabla = :nombreTabla")})
public class Auditoriaartemis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "nombreTabla")
    private String nombreTabla;

    public Auditoriaartemis() {
    }

    public Auditoriaartemis(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
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
        if (!(object instanceof Auditoriaartemis)) {
            return false;
        }
        Auditoriaartemis other = (Auditoriaartemis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.artemis.entities.Auditoriaartemis[ id=" + id + " ]";
    }
    
}
