package com.HW3.Homework3.Models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "description")
    public String description;
    @Column(name = "price")
    public BigDecimal price;
    @Column(name = "color")
    public String color;
    public Inventory(){

    }
    public Inventory(String description, BigDecimal price, String color){
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public int getId(){return id;}
    public void setId(){this.id=id;}
    public String getDescription(){return description;}
    public void setDescription(){this.description=description;}
    public BigDecimal getPrice(){return price;}
    public void  setPrice(){this.price=price;}
    public String getColor(){return color;}
    public void setColor(){this.color=color;}
}
