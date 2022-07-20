package ru.otus.homeworks.hw2;

import java.util.Scanner;

public class HomeWork {
    private static final String QUEST = "Вопрос ";
    private static final String ANSWERS = "Варианты ответа:";
    private static final String PROMPT = "Введите ответ:";
    private static final String CORRECT_TXT = "Верно";
    private static final String ERROR_TXT = "Ошибка";
    private static final String RESULT_OUTPUT = "Правильных ответов: %d\tНеправильных ответов: %d";


    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[][][] questAndAnswer = {{{"quest1"}, {"answer11!", "answer12", "answ13"}, {"1"}},
                {{"q2"}, {"a21", "a22", "a23!", "a24"}, {"3"}},
                {{"q3"}, {"a31", "a32!", "a33", "a34", "a35"}, {"2"}}
        };
        for (int i = 0; i < questAndAnswer.length; i++) {
            System.out.println(QUEST + (i + 1) + ":" + questionFrom(questAndAnswer, i));
            System.out.println(ANSWERS);
            String[] answers = answersFrom(questAndAnswer, i);
            for (int j = 0; j < answers.length; j++) {
                System.out.println((j + 1) + ": " + answers[j]);
            }
            System.out.println(PROMPT);
            if (readAnswer().equalsIgnoreCase(getCheckAnswer(questAndAnswer, i))) {
                correctCount++;
                System.out.println(CORRECT_TXT);
            } else {
                wrongCount++;
                System.out.println(ERROR_TXT);
            }

        }
        System.out.printf(RESULT_OUTPUT,correctCount,wrongCount);
    }

    static String questionFrom(String[][][] questAndAnswer, int index) {
        return questAndAnswer[index][0][0];
    }

    static String getCheckAnswer(String[][][] questAndAnswer, int index) {
        return questAndAnswer[index][2][0];
    }

    static String[] answersFrom(String[][][] questAndAnswer, int index) {
        String[] result = new String[questAndAnswer[index][1].length];
        System.arraycopy(questAndAnswer[index][1], 0, result, 0, result.length);
        return result;
    }

    static String readAnswer() {
        Scanner scanner = new Scanner(System.in);
        //TODO String.valueOf()
        String answer = scanner.nextLine();
        return answer;

    }
}