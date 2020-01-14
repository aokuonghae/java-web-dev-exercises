package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList();
    private Date lastModifiedDate;

    public Menu (ArrayList<MenuItem> menu, Date lastModifiedDate){
        this.menu=menu;
        this.lastModifiedDate=lastModifiedDate;
    }

    public ArrayList<MenuItem> addItem(MenuItem item){
        this.menu.add(item);
        return this.menu;
    }

    public void printMenu(){
        for (int i=0; i<menu.size(); i++){
            System.out.println(this.menu.get(i).getPrice());
        }
    }

}
