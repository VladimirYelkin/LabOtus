package ru.otus.simulator.lab4;

public class WordUtils {
    public static String reverseWords(String inputText) {
        String result = inputText.trim();
        String[] buffArray = result.split(" ");
        result = "";
        for (int i = buffArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                result += buffArray[i] + " ";
            } else {
                result += buffArray[i];
            }
        }
        return result;
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word "));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords(" два слова"));
        System.out.println("Ввод трех слов - " + WordUtils.reverseWords("не два слова"));
        System.out.println("Ввод четырех слов - " + WordUtils.reverseWords("точно не два слова"));


    }
}