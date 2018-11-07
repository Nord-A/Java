package com.osorio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();

        addOrder(placeToVisit,"Sydney");
        addOrder(placeToVisit,"Melbourne");
        addOrder(placeToVisit,"Brisbane");
        addOrder(placeToVisit,"Perth");
        addOrder(placeToVisit,"Camberra");
        addOrder(placeToVisit,"Adelaide");
        addOrder(placeToVisit,"Darwin");
        printList(placeToVisit);



       addOrder(placeToVisit,"Alice Springs");
       addOrder(placeToVisit, "Darwin");
       printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=================");
    }

    private static boolean addOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison>0){
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison <0){
                // move on next city

            }

        }
        stringListIterator.add(newCity);
        return true;
    }
}


