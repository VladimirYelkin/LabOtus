package ru.otus.homeworks.hw3;

import java.util.Scanner;

public class ReaderFromConsole {
    public static int read(int numAnswers) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            answer = scanner.nextInt();
        } while ((answer < 1) || (answer > numAnswers));
        return answer;
    }

}
