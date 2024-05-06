package com.mycompany.collectionframeworkproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {

    public static String getInputList(String FilePath) throws FileNotFoundException {

        File file = new File(FilePath);
        Scanner sc = new Scanner(file);
        String inputString = "";

        while (sc.hasNext()) {
            inputString = inputString + sc.next() + " ";
        }
        return inputString.toLowerCase();
    }

    public static ArrayList<String> getStopwordFile(String FilePath) throws FileNotFoundException {

        File file = new File(FilePath);
        Scanner sc = new Scanner(file);

        ArrayList<String> inputList = new ArrayList<>();
        while (sc.hasNext()) {
            inputList.add(sc.next());

        }
        return inputList;
    }

    public static ArrayList<Character> getSymbolList(String FilePath) throws FileNotFoundException {

        File file = new File(FilePath);
        Scanner sc = new Scanner(file);

        ArrayList<Character> symbolList = new ArrayList<>();
        while (sc.hasNext()) {
            symbolList.add(sc.next().charAt(0));
        }
        return symbolList;
    }

    public static ArrayList<String> getWordList(String input) {

        String inputString[] = input.split(" ");
        ArrayList<String> inputList = new ArrayList<>();
        for (String string : inputString) {
            inputList.add(string);
        }
        return inputList;
    }
}
