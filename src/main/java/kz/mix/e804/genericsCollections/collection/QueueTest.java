//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections.collection;

import java.util.*;

// This program shows the key characteristics of Queue interface
class QueueTest {
    public static void main(String[] args) {
        Queue<String> loginSequence = new LinkedList<String>();
        loginSequence.add("Harrison");
        loginSequence.add("McCartney");
        // Adds the Element to the Queue
        loginSequence.add("Starr");

        // Analogue of add() method, don't throw any exception when failed
        loginSequence.offer("Lennon");

        // Returns the head element from Queue but does not remove it; if the Queue is empty, it throws NoSuchElementException
        System.out.println(loginSequence.element());

        // Returns the head element from Queue but does not remove it; if the Queue is empty, it returns null
        // Analogue of the element() method
        System.out.println(loginSequence.peek());

        System.out.println("The login sequence is: " + loginSequence);
        while (!loginSequence.isEmpty()) {
            // Removes an element from the Queue and returns it; if hte Queue is empty, it throws NoSuchElementException
            System.out.println("Removing " + loginSequence.remove());
        }

        // Removes an element from the Queue and returns it; if the Queue is empty, it returns null
        // Analogue of the remove() method
        System.out.println(loginSequence.poll());
    }
}
