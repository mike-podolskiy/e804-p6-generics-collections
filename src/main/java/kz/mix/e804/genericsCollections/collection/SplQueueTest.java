//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections.collection;

import java.util.*;

// This program shows the usage of Deque interface
class SplQueue {
    private Deque<String> splQ = new ArrayDeque<>();

    void addInQueue(String customer) {
        splQ.addLast(customer);
    }

    void removeFront() {
        splQ.removeFirst();
    }

    void removeBack() {
        splQ.removeLast();
    }

    void printQueue() {
        System.out.println("Special queue contains: " + splQ);
    }
}

public class SplQueueTest {
    public static void main(String[] args) {
        SplQueue splQ = new SplQueue();
        splQ.addInQueue("Harrison");
        splQ.addInQueue("McCartney");
        splQ.addInQueue("Starr");
        splQ.addInQueue("Lennon");

        splQ.printQueue();
        splQ.removeFront();
        splQ.removeBack();
        splQ.printQueue();
    }
}
