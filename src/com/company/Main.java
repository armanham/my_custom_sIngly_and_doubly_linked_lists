package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();
        mySinglyLinkedList.add("1");
        mySinglyLinkedList.add("2");
        mySinglyLinkedList.add("3");
        mySinglyLinkedList.add("4");
        mySinglyLinkedList.add("5");
        System.out.println(mySinglyLinkedList.toString());




        MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();
        myDoublyLinkedList.add("11");
        myDoublyLinkedList.add("22");
        myDoublyLinkedList.add("33");
        myDoublyLinkedList.add("44");
        myDoublyLinkedList.add("55");
        myDoublyLinkedList.remove("55");
        System.out.println(myDoublyLinkedList.toString());
        System.out.println(myDoublyLinkedList.get(-1));


    }
}
