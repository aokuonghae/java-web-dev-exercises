package org.launchcode.java.exercises.controlflow.arraylistpractice;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SumIntegers {
    public static void main (String[] args){
        List<Integer> numList= new ArrayList<> (Arrays.asList(14,4,28,44,10,8,13,26,59,100));
        int totalSum= SumIntMath.getSumEven(numList);

        System.out.println(totalSum);

    }
}
