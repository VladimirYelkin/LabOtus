package ru.otus.homeworks.hw3;

public class SimpleLinkedListQandA {

    private final NodeList first = new NodeList();
    private final NodeList last = new NodeList();
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
        if ((currentItem == last) || (currentItem.next == last)) return -1;
        if (currentItem == first) {
            currentItem = first.next;
            indexCurrentItem++;
        } else {
            currentItem = currentItem.next;
            indexCurrentItem++;
        }
        return indexCurrentItem;
    }

    public QuestAndAnswers getItem() {
        return currentItem.value;
    }

    public int getIndexCurrentItem() {
        return indexCurrentItem;
    }

    public void add(QuestAndAnswers value) {
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

     class NodeList {
        private NodeList prev;
        private QuestAndAnswers value;
        private NodeList next;

    }
}
