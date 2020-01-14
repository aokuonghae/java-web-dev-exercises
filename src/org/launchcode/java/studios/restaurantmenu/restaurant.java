package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class restaurant {
    public static void main(String[] args){
        MenuItem newItem = new MenuItem(1.00, "Pasta  Al Dente", "Main Courses", false);
        MenuItem newItem2 = new MenuItem (2.01, "French Fries", "Appetizers", false);
        Date today = new Date();
        ArrayList<MenuItem> newMenu = new ArrayList<>();
        Menu myMenu = new Menu (newMenu, today);
        myMenu.addItem(newItem);
        myMenu.addItem(newItem2);
        myMenu.printMenu();
    }
}
