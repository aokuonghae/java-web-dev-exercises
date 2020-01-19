package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> menu;
    private Date lastModifiedDate;


    public Menu (ArrayList<MenuItem> menu, Date lastModifiedDate){
        this.menu=menu;
        this.lastModifiedDate=lastModifiedDate;
    }

    public ArrayList<MenuItem> addItem(MenuItem item){
        for (MenuItem menuItem : this.menu) {
            if (menuItem.equals(item)) {
                System.out.println("Blah");
            }
        }
//        if (this.menu.contains(item.getDescription())) {
//            System.out.println("This is already on the menu!");
//        } else {
//            this.menu.add(item);
//        }
        return this.menu;
    }

    public void getItem(MenuItem item){
        System.out.println(item.getDescription());
    }

    public void getMenuItem(){
     }

    public ArrayList<MenuItem> removeItem(MenuItem item){
        int index;
        for(int i=0; i<menu.size(); i++){
            if (this.menu.get(i).getDescription().equals(item)){
                index=i;
            }
            this.menu.remove(i);
        }
        return this.menu;
    }

    public void printMenu(){
        for (MenuItem menuItem : menu) {
            System.out.println("Menu: {" + "\r\n" +
                    "Price: " + menuItem.getPrice() + "." + "\r\n" +
                    "Description: " + menuItem.getDescription() + "." + "\r\n" +
                    "Category: " + menuItem.getCategory() + "." + "\r\n" +
                    "isNew: " + menuItem.getIsNew() + "." + "\r\n" +
                    '}');
        }
    }

    public void printMenuItem(int index){
        if (index > this.menu.size()){
            System.out.println("This item does not exist!");
        } else {
            System.out.println("Menu: {" + "\r\n" +
                    "Price: " + this.menu.get(index).getPrice() + "." + "\r\n" +
                    "Description: " + this.menu.get(index).getDescription() + "." + "\r\n" +
                    "Category: " + this.menu.get(index).getCategory() + "." + "\r\n" +
                    "isNew: " + this.menu.get(index).getIsNew() + "." + "\r\n" +
                    '}');
        }
    }

    public void lastUpdatedDate (Date date){
        this.lastModifiedDate=date;
    }

    public void comparePrices(MenuItem menuItem1, MenuItem menuItem2){
        System.out.println(menuItem1.getPrice().equals(menuItem2.getPrice()));
    }
}
