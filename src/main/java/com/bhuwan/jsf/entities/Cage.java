/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bhuwan.jsf.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Bhuwan Gautam<bhuwangautam@lftechnology.com>
 */
@Entity
@Table(name = "cage")
@NamedQueries({
    @NamedQuery(name = "Cage.findAll", query = "SELECT c FROM Cage c"),
    @NamedQuery(name = "Cage.findByCageId", query = "SELECT c FROM Cage c WHERE c.cageId = :cageId"),
    @NamedQuery(name = "Cage.findByCageNo", query = "SELECT c FROM Cage c WHERE c.cageNo = :cageNo"),
    @NamedQuery(name = "Cage.findByLocation", query = "SELECT c FROM Cage c WHERE c.location = :location")})
public class Cage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cage_id")
    private Integer cageId;
    @Column(name = "cage_no")
    private String cageNo;
    @Column(name = "location")
    private String location;
    @JoinColumn(name = "animal_id", referencedColumnName = "animal_id")
    @ManyToOne
    private Animal animalId;

    public Cage() {
    }

    public Cage(Integer cageId) {
        this.cageId = cageId;
    }

    public Integer getCageId() {
        return cageId;
    }

    public void setCageId(Integer cageId) {
        this.cageId = cageId;
    }

    public String getCageNo() {
        return cageNo;
    }

    public void setCageNo(String cageNo) {
        this.cageNo = cageNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Animal animalId) {
        this.animalId = animalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cageId != null ? cageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cage)) {
            return false;
        }
        Cage other = (Cage) object;
        if ((this.cageId == null && other.cageId != null) || (this.cageId != null && !this.cageId.equals(other.cageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bhuwan.jsf.entities.Cage[ cageId=" + cageId + " ]";
    }

}
