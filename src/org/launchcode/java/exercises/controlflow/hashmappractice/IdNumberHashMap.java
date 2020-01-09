package org.launchcode.java.exercises.controlflow.hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdNumberHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId;

        System.out.println("Enter your student's ID (or Enter to finish):");
         do {
             System.out.print("Id Number:");
             newId = input.nextInt();

             if (!newId.equals("")) {
                 System.out.print("Student:");
                 String studentName = input.nextLine();
                 students.put(newId, studentName);
                 input.nextLine();
             }
         } while (!newId.equals(""));

             System.out.println ("\nID roster:");

             for (Map.Entry <Integer, String> student: students.entrySet()) {
                 System.out.println((student.getKey() + " (" + student.getValue() + ")"));
             }

    }
}
