package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        double radius;
        double area;
        Scanner input;
        input = new Scanner (System.in);
        System.out.println("Enter radius of the circle:");
        if (input.hasNextDouble()){
            radius = input.nextDouble();
            while (radius < 0){
                System.out.println("Enter a valid radius.");
                radius = input.nextDouble();
            }
            input.close();
                area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
