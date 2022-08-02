package ru.otus.homeworks.hw3;

public class QuestAnswersMachine {
    private static final String RESULT_OUTPUT = "Правильных ответов: %d\tНеправильных ответов: %d";
    private static final String CORRECT_TXT = "Верно";
    private static final String ERROR_TXT = "Ошибка";
    private static int correctCount = 0, wrongCount = 0;

    public static void ask(QuestAndAnswers questAndAnswers) {
        if (AskAndCheck.ask(questAndAnswers)) {
            correctCount++;
            System.out.println(CORRECT_TXT);
        } else {
            wrongCount++;
            System.out.println(ERROR_TXT);
        }
    }
    public static void askAll (SimpleLinkedListQandA simpleLinkedListQandA) {
        while (simpleLinkedListQandA.nextItem() > 0) {
            System.out.println(simpleLinkedListQandA.getIndexCurrentItem());
            ask(simpleLinkedListQandA.getItem());
        }
    }

    public static void showResult() {
        System.out.printf(RESULT_OUTPUT, correctCount, wrongCount);
    }
}
