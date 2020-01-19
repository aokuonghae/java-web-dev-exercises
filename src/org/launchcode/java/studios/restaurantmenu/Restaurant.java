package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        MenuItem newItem = new MenuItem(1.00, "Pasta  Al Dente", "Main Courses", false);
        MenuItem newItem2 = new MenuItem (2.01, "French Fries", "Appetizers", false);
        MenuItem newItem3 = new MenuItem (3.00, "French Fries", "Appetizers", true );
        Date today = new Date();
        ArrayList<MenuItem> newMenu = new ArrayList<>();
        Menu myMenu = new Menu (newMenu, today);
        myMenu.addItem(newItem);
        myMenu.addItem(newItem2);
//        myMenu.removeItem(newItem2);
//        myMenu.printMenu();
//        myMenu.comparePrices(newItem, newItem2);
//        myMenu.addItem(newItem3);
//        myMenu.printMenu();
//        myMenu.getItem(newItem3);
        myMenu.getMenuItem();

    }
}
