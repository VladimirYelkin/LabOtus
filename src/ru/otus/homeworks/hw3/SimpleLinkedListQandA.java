package ru.otus.homeworks.hw3;

public class SimpleLinkedListQandA {

    private NodeList first = new NodeList();
    private NodeList last = new NodeList();
    private NodeList currentItem = first;
    private int indexCurrentItem = 0;

    public void printAll() {
        NodeList currentElement = first.next;
        while ((currentElement) != last) {
            currentElement.value.show();
            currentElement = currentElement.next;
        }
    }

    public int nextItem() {
        if (currentItem == last) return -1;
        if (currentItem == first) {
            currentItem = first.next;
            indexCurrentItem++;
        } else {
            currentItem = currentItem.next;
            indexCurrentItem++;
        }
        if (currentItem == last) return -1;
        return indexCurrentItem;
    }

    public QuestAndAnswers getItem() {
        return currentItem.value;
    }

    public void add(QuestAndAnswers value) {
        //напишите тут ваш код
        NodeList newElement = new NodeList();
        newElement.value = value;

        if (first.next == null) {
            newElement.prev = first;
            first.next = newElement;
            newElement.next = last;
            last.prev = newElement;

        } else {
            newElement.prev = last.prev;
            newElement.prev.next = newElement;
            newElement.next = last;
            last.prev = newElement;
        }

    }

    public class NodeList {
        private NodeList prev;
        private QuestAndAnswers value;
        private NodeList next;

    }
}
