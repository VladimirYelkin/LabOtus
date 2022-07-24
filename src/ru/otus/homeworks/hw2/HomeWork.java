package ru.otus.homeworks.hw2;

import java.util.Arrays;
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

        Object[][][] questAndAnswer = {{{"Какому примитивному типу данных соответсвует диапозон от -2147483648 до 2147483647 "}, {"byte", "short", "int", "long"}, {3}},
                {{"какой тип будет у переменной после компиляции в таком варианте var k=34.694;"}, {"String", "char[]", "double", "int", "float"}, {3}},
                {{"какое ключевое слово используется для создания константы "}, {"constant", "final", "static", "private", "protected"}, {2}},
                {{"quest4"}, {"answer41", "answer42", "answer43", "answer44"}, {1}}};
        String questToArray = "questFromMethod5";
        String[] answersToArrays = {"answers51", "answers52", "answers53"};
        addQuestAndAswers(questAndAnswer, questToArray, answersToArrays, 1);

        for (int i = 0; i < questAndAnswer.length; i++) {
            System.out.println(QUEST + (i + 1) + ":" + questionFromArray(questAndAnswer, i));
            System.out.println(ANSWERS);
            String[] answers = answersFromArray(questAndAnswer, i);
            for (int j = 0; j < answers.length; j++) {
                System.out.println((j + 1) + ": " + answers[j]);
            }
            int maxNumberAnswer = answers.length;
            System.out.printf(PROMPT, 1, maxNumberAnswer);
            if (checkAnswer(readAnswerFromConsole(maxNumberAnswer), getCorrectAnswerFromArray(questAndAnswer, i))) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.printf(RESULT_OUTPUT, correctCount, wrongCount);
    }

    private static void showQuestandAnswersArray(Object[][][] showArray) {
        for (int i = 0; i < showArray.length; i++) {
            System.out.println(questionFromArray(showArray, i));
            System.out.println(Arrays.toString(answersFromArray(showArray, i)));
            System.out.println(getCorrectAnswerFromArray(showArray, i));
        }
    }

    private static Object[][][] addQuestAndAswers(Object[][][] inArray, String quest, String[] answers, int correcrtAnswer) {
        //TODO : addative elemets to Arrays of Objects[][][]
        showQuestandAnswersArray(inArray);
        Object[][][] returnArray = null;

        return returnArray;
    }

    private static boolean checkAnswer(int answerFromConsole, int answerFromArray) {
        if (answerFromConsole == answerFromArray) {
            System.out.println(CORRECT_TXT);
            return true;
        } else {
            System.out.println(ERROR_TXT);
            return false;
        }
    }

    private static String questionFromArray(Object[][][] questAndAnswer, int index) {
        return String.valueOf(questAndAnswer[index][0][0]);
    }

    private static Integer getCorrectAnswerFromArray(Object[][][] questAndAnswer, int index) {
        return (Integer) questAndAnswer[index][2][0];
    }

    private static String[] answersFromArray(Object[][][] questAndAnswer, int index) {
        String[] result = new String[questAndAnswer[index][1].length];
        System.arraycopy(questAndAnswer[index][1], 0, result, 0, result.length);
//        for (int i = 0; i < questAndAnswer[index][1].length; i++) { // system.arraycopy is best SUGAR
//            result[i] = (String) questAndAnswer[index][1][i];       //
//        }                                                           //
        return result;
    }

    private static int readAnswerFromConsole(int maxNumberAnswers) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            answer = scanner.nextInt();
        } while ((answer < 1) || (answer > maxNumberAnswers));
        return answer;

    }

}
