package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CountingCharacters {
    public static void main (String[] args) throws IOException {
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter word to count:");
//        String word=input.nextLine();
//        input.close();
        String word=readFile("src/org/launchcode/java/studios/countingcharacters/Studiothingy.txt");

        char[] searchArray= word.toLowerCase().toCharArray();

        HashMap<Character, Integer> mapOutput = new HashMap<>();

        for (char c : searchArray) {
            if (Character.isLetter(c)) {
                if (!mapOutput.containsKey(c)) {
                    mapOutput.put(c, 1);
                } else {
                    mapOutput.put(c, mapOutput.get(c)+1);
                }
            }
        }
        System.out.println(mapOutput);
    }
    public static String readFile(String pathname) throws IOException {

        File file = new File(pathname);
        StringBuilder fileContents = new StringBuilder((int)file.length());

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + System.lineSeparator());
            }
            return fileContents.toString();
        }
    }
}
