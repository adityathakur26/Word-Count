package com.mycompany.collectionframeworkproject;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataCleaning {

    public static String getremoveSymbol(String inputString) throws FileNotFoundException {

        ArrayList<Character> symbolList = FileOperations.getSymbolList("C:\\Users\\admin\\OneDrive\\Desktop\\CollectionFrameworkProject\\src\\main\\java\\com\\mycompany\\collectionframeworkproject\\stopwords.txt");
        ArrayList<Character> inputList = new ArrayList<>();
        char inputChar[] = inputString.toCharArray();
        for (char string : inputChar) {
            inputList.add(string);
        }
        inputList.removeAll(symbolList);
        String string = "";
        for (Character character : inputList) {
            // string = string+String.valueOf(character);
            string = string.concat(String.valueOf(character));
        }
        return string;
    }

    public static ArrayList<String> removeStopword(String inputString) throws FileNotFoundException {
        ArrayList<String> stopwardList = FileOperations.getStopwordFile("C:\\Users\\admin\\OneDrive\\Desktop\\CollectionFrameworkProject\\src\\main\\java\\com\\mycompany\\collectionframeworkproject\\symbols.txt");
        ArrayList<String> inputList = FileOperations.getWordList(inputString);
        // stopwardList.add("");s
        inputList.removeAll(stopwardList);
        return inputList;
    }

}
