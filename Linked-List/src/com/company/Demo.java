package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Miami");
        placesToVisit.add("Tampa");
        placesToVisit.add("Orlando");
        placesToVisit.add("Jacksonville");
        placesToVisit.add("Miramar");
        placesToVisit.add("Fort Lauderdale");
        placesToVisit.add("Naples");

        printList(placesToVisit);

        // Inserting Record
        placesToVisit.add(1, "Clearwater");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }
}
