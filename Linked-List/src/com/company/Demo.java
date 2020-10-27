package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        // Removing a record
        placesToVisit.remove(4);
        printList(placesToVisit);



    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal, do not add
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if(comparison > 0){
                // new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                // move on to next city
            }
        }
        stringListIterator.add(newCity);
    }
}
