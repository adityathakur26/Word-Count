package com.mycompany.collectionframeworkproject;

import java.util.TreeSet;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CollectionFrameworkProject {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:\\Users\\admin\\OneDrive\\Desktop\\CollectionFrameworkProject\\src\\main\\java\\com\\mycompany\\collectionframeworkproject\\input.txt";
        ArrayList<String> wordList = UserOperations.getWordList(filePath);
        System.out.println("\n\n ********** Word List **********");
        UserOperations.printAll(wordList);
        System.out.println("Total Words :" + wordList.size());

        System.out.println("\n\n ********** Unique Word List **********");
        TreeSet<String> uniqueWordList = UserOperations.getUniqueWordList(wordList);
        UserOperations.printAll(uniqueWordList);
        System.out.println("Total Words :" + uniqueWordList.size());

        System.out.println("\n\n ********** Word Count **********");
        String[][] wordCount = UserOperations.getWordCount(wordList, uniqueWordList);
        UserOperations.printAll(wordCount);
        System.out.println("Total Words :" + wordCount.length);

        System.out.println("\n\n ********** Top5 Word Count **********");
        String top5[][] = UserOperations.getTop5WordList(wordCount);
        UserOperations.printAll(top5);
        System.out.println("Total Words :" + top5.length);

        System.out.println("\n\n ********** Top10 Word Count **********");

        String top10[][] = UserOperations.getTop10WordList(wordCount);
        UserOperations.printAll(top10);
        System.out.println("Total Words :" + top10.length);

        System.out.println("\n\n ********** Bottom 5 Word Count **********");
        String bottom5[][] = UserOperations.getBottom5WordList(wordCount);
        UserOperations.printAll(bottom5);
        System.out.println("Total Words :" + bottom5.length);

        System.out.println("\n\n ********** Bottom 10 Word Count **********");
        String bottom10[][] = UserOperations.getBottom10WordList(wordCount);
        UserOperations.printAll(bottom10);
        System.out.println("Total Words :" + bottom10.length);

        System.out.println("\n\n ********** Character Count **********");
        String charCount[][] = UserOperations.getCharCount(wordList);
        UserOperations.printAll(charCount);
        System.out.println("Total Words :" + charCount.length);

        System.out.println("\n\n ********** Top5 Character Count **********");
        String top5Char[][] = UserOperations.getTop5CharList(charCount);
        UserOperations.printAll(top5Char);
        System.out.println("Total Words :" + top5Char.length);

        System.out.println("\n\n ********** Top10 Character Count **********");
        String top10Char[][] = UserOperations.getTop10CharList(charCount);
        UserOperations.printAll(top10Char);
        System.out.println("Total Words :" + top10Char.length);

        System.out.println("\n\n ********** Bottom 5 Character Count **********");
        String bottom5Char[][] = UserOperations.getBottom5CharList(charCount);
        UserOperations.printAll(bottom5Char);
        System.out.println("Total Words :" + bottom5Char.length);

        System.out.println("\n\n ********** Bottom 10 Character Count **********");
        String bottom10Char[][] = UserOperations.getBottom10CharList(charCount);
        UserOperations.printAll(bottom10Char);
        System.out.println("Total Words :" + bottom10Char.length);

       
        }
}
