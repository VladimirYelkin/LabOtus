package ru.otus.homeworks.hw2;

import java.util.Scanner;

public class HomeWork {
    private static final String QUEST = "Вопрос ";
    private static final String ANSWERS = "Варианты ответа:";
    private static final String PROMPT = "Введите ответ от %d до %d: \n";
    private static final String CORRECT_TXT = "Верно";
    private static final String ERROR_TXT = "Ошибка";
    private static final String RESULT_OUTPUT = "Правильных ответов: %d\tНеправильных ответов: %d";


    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[][][] questAndAnswer = {{{"Какому примитивному типу данных соответсвует диапозон от -2147483648 до 2147483647 "}, {"byte", "short", "int","long"}, {"3"}},
                {{"какой тип переменной будет у переменной после компиляции в таком варианте var k=34.694;"}, {"String", "char[]", "double", "int","float"}, {"3"}},
                {{"какое ключевое слово использыется для создания константы "}, {"constant", "final", "static", "private", "protected"}, {"2"}}
        };
        for (int i = 0; i < questAndAnswer.length; i++) {
            System.out.println(QUEST + (i + 1) + ":" + questionFrom(questAndAnswer, i));
            System.out.println(ANSWERS);
            String[] answers = answersFrom(questAndAnswer, i);
            for (int j = 0; j < answers.length; j++) {
                System.out.println((j + 1) + ": " + answers[j]);
            }
            System.out.printf(PROMPT,1,answers.length);
            if (readAnswer(answers.length).equalsIgnoreCase(getCheckAnswer(questAndAnswer, i))) {
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

    static String readAnswer(int maxNumberAnswers) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
             answer = scanner.nextInt();
        } while ((answer <1) || (answer > maxNumberAnswers));
        return String.valueOf(answer);

    }
}
