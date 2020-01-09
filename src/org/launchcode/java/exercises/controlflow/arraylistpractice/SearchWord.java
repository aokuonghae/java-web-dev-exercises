package org.launchcode.java.exercises.controlflow.arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args){
        String seuss="I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String seussArray[]= seuss.split(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length.");
        int value=input.nextInt();
        List<String> wordList= new ArrayList<> (Arrays.asList(seussArray));
        for (String word : wordList){
            if (word.length()==value){
                System.out.println(word);
            }
        }
    }
}
