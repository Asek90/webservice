package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double cost;
    private String ingredients;

    public Pizza(){
    }

    public Pizza(String name, double cost, String ingredients) {
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
