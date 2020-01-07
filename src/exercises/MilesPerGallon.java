package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        float milesDriven;
        float gallons;
        float milesPerGallon;
        Scanner input;
        input = new Scanner (System.in);

        System.out.println("Enter number of miles driven:");
        milesDriven = input.nextFloat();
        System.out.println("Enter gallons of gas used:");
        gallons= input.nextFloat();
        input.close();

        milesPerGallon= milesDriven/gallons;
        System.out.println("Your miles per gallon is "+ milesPerGallon + " miles-per-gallon.");
    }
}
