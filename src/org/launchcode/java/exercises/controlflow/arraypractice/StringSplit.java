package org.launchcode.java.exercises.controlflow.arraypractice;

import java.util.Arrays;

public class StringSplit {
    public static void main (String[] args){
        String seuss="I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] seussArraySpace= seuss.split(" ");
        System.out.println(Arrays.toString(seussArraySpace));
        String[] seussArrayPeriod= seuss.split("\\.");
        System.out.println(Arrays.toString(seussArrayPeriod));
    }
}
