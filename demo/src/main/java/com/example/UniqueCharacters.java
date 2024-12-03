package com.example;


import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "lambda", "unique", "abc"};

        String[] uniqueWords = Arrays.stream(words)
            .filter(word -> word.chars().distinct().count() == word.length())
            .toArray(String[]::new);

        System.out.println("Слова з унікальними символами: " + Arrays.toString(uniqueWords));
    }
}
