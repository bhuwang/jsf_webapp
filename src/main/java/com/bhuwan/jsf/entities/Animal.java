/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bhuwan.jsf.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Bhuwan Gautam<bhuwangautam@lftechnology.com>
 */
@Entity
@Table(name = "animal")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a"),
    @NamedQuery(name = "Animal.findByAnimalId", query = "SELECT a FROM Animal a WHERE a.animalId = :animalId"),
    @NamedQuery(name = "Animal.findByTotalNo", query = "SELECT a FROM Animal a WHERE a.totalNo = :totalNo"),
    @NamedQuery(name = "Animal.findByType", query = "SELECT a FROM Animal a WHERE a.type = :type")})
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "animal_id")
    private Integer animalId;
    @Column(name = "total_no")
    private Integer totalNo;
    @Column(name = "type")
    private String type;
    @JoinTable(name = "animal_food_item", joinColumns = {
        @JoinColumn(name = "animal_id", referencedColumnName = "animal_id")}, inverseJoinColumns = {
        @JoinColumn(name = "food_item_id", referencedColumnName = "food_item_id")})
    @ManyToMany
    private List<FoodItem> foodItemList;
    @OneToMany(mappedBy = "animalId")
    private List<Cage> cageList;
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId")
    @ManyToOne
    private Category categoryId;

    public Animal() {
    }

    public Animal(Integer animalId) {
        this.animalId = animalId;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public Integer getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(Integer totalNo) {
        this.totalNo = totalNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public List<Cage> getCageList() {
        return cageList;
    }

    public void setCageList(List<Cage> cageList) {
        this.cageList = cageList;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (animalId != null ? animalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.animalId == null && other.animalId != null) || (this.animalId != null && !this.animalId.equals(other.animalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bhuwan.jsf.entities.Animal[ animalId=" + animalId + " ]";
    }

}
