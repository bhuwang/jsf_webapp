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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Bhuwan Gautam<bhuwangautam@lftechnology.com>
 */
@Entity
@Table(name = "food_item")
@NamedQueries({
    @NamedQuery(name = "FoodItem.findAll", query = "SELECT f FROM FoodItem f"),
    @NamedQuery(name = "FoodItem.findByFoodItemId", query = "SELECT f FROM FoodItem f WHERE f.foodItemId = :foodItemId"),
    @NamedQuery(name = "FoodItem.findByName", query = "SELECT f FROM FoodItem f WHERE f.name = :name"),
    @NamedQuery(name = "FoodItem.findByQuantity", query = "SELECT f FROM FoodItem f WHERE f.quantity = :quantity")})
public class FoodItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "food_item_id")
    private Integer foodItemId;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private String quantity;
    @ManyToMany(mappedBy = "foodItemList")
    private List<Animal> animalList;

    public FoodItem() {
    }

    public FoodItem(Integer foodItemId) {
        this.foodItemId = foodItemId;
    }

    public Integer getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(Integer foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodItemId != null ? foodItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FoodItem)) {
            return false;
        }
        FoodItem other = (FoodItem) object;
        if ((this.foodItemId == null && other.foodItemId != null) || (this.foodItemId != null && !this.foodItemId.equals(other.foodItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bhuwan.jsf.entities.FoodItem[ foodItemId=" + foodItemId + " ]";
    }

}
