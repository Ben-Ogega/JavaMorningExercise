package com.karacana.dataStructuresAndAlgols;

import java.util.LinkedList;

public class DataStructsLinkedLists {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("Benard");
        linkedList.push("George");
        linkedList.push("Antony");

        System.out.println(linkedList.stream().toList());

        // To remove an item from a linkedList
        linkedList.poll();

        System.out.println(linkedList.stream().toList());

    }
}
