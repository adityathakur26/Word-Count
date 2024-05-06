package com.mycompany.collectionframeworkproject;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class UserOperations {

    public static void printAll(Collection<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void printAll(String[][] list) {
        for (String[] strings : list) {
            System.out.println(strings[0] + " " + strings[1]);
        }
    }

    public static ArrayList<String> getWordList(String filePath) throws FileNotFoundException {
        String input = FileOperations.getInputList(filePath);
        input = DataCleaning.getremoveSymbol(input);
        ArrayList<String> list = DataCleaning.removeStopword(input);
        return list;
    }

    public static TreeSet<String> getUniqueWordList(ArrayList<String> wordList) {
        return new TreeSet<>(wordList);
    }

    public static String[][] getWordCount(ArrayList<String> wordList, TreeSet<String> uniqueWordList) {

        String wordCount[][] = new String[uniqueWordList.size()][2];
        int row = 0;
        for (String word : uniqueWordList) {
            int count = Collections.frequency(wordList, word);
            String countString = String.valueOf(count);
            wordCount[row][0] = word;
            wordCount[row][1] = countString;
            row++;
        }

        return wordCount;
    }

    public static String[][] getTop5WordList(String wordCount[][]) {
        String top5[][] = new String[5][2];

        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int iCount = Integer.parseInt(wordCount[i][1]);
                int jCount = Integer.parseInt(wordCount[j][1]);

                if (iCount < jCount) {
                    //swap word
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;
                    //swap count
                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            top5[i][0] = wordCount[i][0];
            top5[i][1] = wordCount[i][1];
        }
        return top5;
    }

    public static String[][] getTop10WordList(String wordCount[][]) {
        String top10[][] = new String[10][2];

        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int iCount = Integer.parseInt(wordCount[i][1]);
                int jCount = Integer.parseInt(wordCount[j][1]);
                if (iCount < jCount) {
                    //swap word
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;
                    //swap count
                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            top10[i][0] = wordCount[i][0];
            top10[i][1] = wordCount[i][1];
        }
        return top10;
    }

    public static String[][] getBottom5WordList(String wordCount[][]) {
        String bottom5[][] = new String[5][2];

        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int iCount = Integer.parseInt(wordCount[i][1]);
                int jCount = Integer.parseInt(wordCount[j][1]);
                if (iCount > jCount) {
                    //swap word
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;
                    //swap count
                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            bottom5[i][0] = wordCount[i][0];
            bottom5[i][1] = wordCount[i][1];
        }
        return bottom5;
    }

    public static String[][] getBottom10WordList(String wordCount[][]) {
        String bottom10[][] = new String[10][2];

        for (int i = 0; i < wordCount.length; i++) {
            for (int j = i; j < wordCount.length; j++) {
                int iCount = Integer.parseInt(wordCount[i][1]);
                int jCount = Integer.parseInt(wordCount[j][1]);
                if (iCount > jCount) {
                    //swap word
                    String temp = wordCount[i][0];
                    wordCount[i][0] = wordCount[j][0];
                    wordCount[j][0] = temp;
                    //swap count
                    temp = wordCount[i][1];
                    wordCount[i][1] = wordCount[j][1];
                    wordCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            bottom10[i][0] = wordCount[i][0];
            bottom10[i][1] = wordCount[i][1];
        }
        return bottom10;
    }

    public static String[][] getCharCount(ArrayList<String> wordList) {

        String input = "";

        for (String string : wordList) {
            input = input + string + " ";
        }

        char inputCharArray[] = input.toCharArray();

        String alphabetArray[] = new String[26];
        int index = 0;
        for (int i = 97; i <= 122; i++) {
            char unicodeAlphabet = (char) i;
            alphabetArray[index] = String.valueOf(unicodeAlphabet);
            index++;
        }
        ArrayList<String> inputStringList = new ArrayList<>();
        for (char c : inputCharArray) {
            inputStringList.add(String.valueOf(c));
        }

        String charCount[][] = new String[alphabetArray.length][2];
        int row = 0;
        for (String alphabet : alphabetArray) {
            int count = Collections.frequency(inputStringList, alphabet);
            String countString = String.valueOf(count);
            charCount[row][0] = alphabet;
            charCount[row][1] = countString;
            row++;
        }
        return charCount;
    }

    public static String[][] getTop5CharList(String charCount[][]) {
        String top5[][] = new String[5][2];

        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int iCount = Integer.parseInt(charCount[i][1]);
                int jCount = Integer.parseInt(charCount[j][1]);
                if (iCount < jCount) {
                    //swap word
                    String temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;
                    //swap count
                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            top5[i][0] = charCount[i][0];
            top5[i][1] = charCount[i][1];
        }
        return top5;
    }

    public static String[][] getTop10CharList(String charCount[][]) {
        String top10[][] = new String[10][2];

        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int iCount = Integer.parseInt(charCount[i][1]);
                int jCount = Integer.parseInt(charCount[j][1]);
                if (iCount < jCount) {
                    //swap word
                    String temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;
                    //swap count
                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            top10[i][0] = charCount[i][0];
            top10[i][1] = charCount[i][1];
        }
        return top10;
    }

    public static String[][] getBottom5CharList(String charCount[][]) {
        String bottom5[][] = new String[5][2];

        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int iCount = Integer.parseInt(charCount[i][1]);
                int jCount = Integer.parseInt(charCount[j][1]);
                if (iCount > jCount) {
                    //swap word
                    String temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;
                    //swap count
                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            bottom5[i][0] = charCount[i][0];
            bottom5[i][1] = charCount[i][1];
        }
        return bottom5;
    }

    public static String[][] getBottom10CharList(String charCount[][]) {
        String bottom10[][] = new String[10][2];

        for (int i = 0; i < charCount.length; i++) {
            for (int j = i; j < charCount.length; j++) {
                int iCount = Integer.parseInt(charCount[i][1]);
                int jCount = Integer.parseInt(charCount[j][1]);
                if (iCount > jCount) {
                    //swap word
                    String temp = charCount[i][0];
                    charCount[i][0] = charCount[j][0];
                    charCount[j][0] = temp;
                    //swap count
                    temp = charCount[i][1];
                    charCount[i][1] = charCount[j][1];
                    charCount[j][1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            bottom10[i][0] = charCount[i][0];
            bottom10[i][1] = charCount[i][1];
        }
        return bottom10;
    }
}
