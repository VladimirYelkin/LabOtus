package ru.otus.homeworks.hw3;

public class HomeWork {
    public static void main(String[] args) {
        SimpleLinkedListQandA listOfQandA = new SimpleLinkedListQandA();
        InitData(listOfQandA);

        while (listOfQandA.nextItem() > 0) {
            QuestAnswersMachine.ask(listOfQandA.getItem());
        }
        QuestAnswersMachine.showResult();

    }

    public static void InitData(SimpleLinkedListQandA simpleLinkedListQandA) {
        simpleLinkedListQandA.add(new QuestAndAnswers("Как называется оператор увеличения, который увеличивает значение переменной на единицу?", "инкремент",
                "декремент", "инкремент", "плюсователь"));
        simpleLinkedListQandA.add(new QuestAndAnswers("Сколько простых (примитивных) типов данных существует в Java? ", "8",
                "5", "7", "11", "8"));
        simpleLinkedListQandA.add(new QuestAndAnswers("Какое значение может принимать переменная булева типа", 1,
                "true", "1", "FFFF"));
    }
}
