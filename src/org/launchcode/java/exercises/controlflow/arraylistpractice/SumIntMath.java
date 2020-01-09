package org.launchcode.java.exercises.controlflow.arraylistpractice;

import java.util.List;

public class SumIntMath {
    public static Integer getSumEven(List<Integer> numbers){
        int sum=0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        return sum;
    }
}
