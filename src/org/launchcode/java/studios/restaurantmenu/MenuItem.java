package org.launchcode.java.studios.restaurantmenu;


import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem( double price, String description, String category, Boolean isNew){
        this.price=price;
        this.description= description;
        this.category=category;
        this.isNew=isNew;
    }

    public String getPrice(){
        return "$"+ this.price;
    }
}
