package ru.otus.homeworks.hw3;

public class QuestAndAnswers {
    private static final String QUEST = "Вопрос ";
    private static final String ANSWERS = "Варианты ответа:";

    String quest;

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    int correctAnswerIndex;//from 1
    String correctAnswer;
    Answers answers;

    public QuestAndAnswers() {

    }

    public QuestAndAnswers(String quest, String correctAnswer, String... answers) {
        this.answers = new Answers(answers);

        this.quest = quest;
        this.correctAnswer = correctAnswer;
        if (this.answers.getIndexOfAnswer(correctAnswer) >= 0) {
            this.correctAnswerIndex = this.answers.getIndexOfAnswer(correctAnswer) + 1;
        }

    }

    public QuestAndAnswers (String quest, int correctAnswerIndex, String... answers) {
        this.correctAnswerIndex =correctAnswerIndex;
        this.quest=quest;
        this.answers = new Answers(answers);
        this.correctAnswer = this.answers.getAnswerOfIndex(correctAnswerIndex);
    }

    public void show() {
        System.out.println(QUEST + this.quest);
        System.out.println(ANSWERS);
        this.answers.show();
    }

    public int numAnswers() {
        return answers.numAnswers();
    }
}
