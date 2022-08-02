package ru.otus.homeworks.hw3;

public class AskAndCheck {
    private static final String PROMPT = "Введите ответ от %d до %d: \n";

    public static boolean ask(QuestAndAnswers questAndAnswers) {
        questAndAnswers.show();

        int numAnswers = questAndAnswers.numAnswers();
        System.out.printf(PROMPT, 1, numAnswers);
        return check(questAndAnswers,ReaderFromConsole.read(numAnswers));
    }
    private static boolean check(QuestAndAnswers questAndAnswers, int answer) {
        if (questAndAnswers.getCorrectAnswerIndex() == answer) { return true; }
        return false;
    }
}
