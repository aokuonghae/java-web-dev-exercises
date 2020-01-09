package org.launchcode.java.exercises.controlflow.arraypractice;

public class ControlFlow {
    public static void main (String[] args){
        int[] someInts= {1,1,2,3,5,8};
        for (int someInt : someInts) {
            if (someInt % 2 == 1){
                System.out.println(someInt);
            }
        }
    }
}
