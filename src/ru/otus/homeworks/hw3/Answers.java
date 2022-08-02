package ru.otus.homeworks.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answers {
    List<String> answers;

     Answers() {
        answers = new ArrayList<String>();
    }

     Answers(String... answers) {
//        this.answers = new ArrayList<String>(List.of(answers));
        this.answers =  Arrays.asList(answers);
    }

    void addAnswer(String newAnswer) {
        answers.add(newAnswer);
    }

    int getIndexOfAnswer(String correctAnswer) {
        return answers.indexOf(correctAnswer);
    }

    String getAnswerOfIndex(int indexCorrectNumber) {
       return (answers.get(indexCorrectNumber+1));
    }

    public void show() {
        int idAnswer = 1;
        for (String answer : answers) {
            System.out.println((idAnswer++) + ": " + answer);
        }
    }

    public int numAnswers() {
        return answers.size();
    }
}
