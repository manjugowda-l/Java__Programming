package com.manju.LinkedList;

public class LinkedList {

    private Node head;
    private int size;

    // Node class
    private class Node {
        int value;
        Node next;

        // Constructor 1
        public Node(int value) {
            this.value = value;
        }

        // Constructor 2
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Constructor
    public LinkedList() {
        this.size = 0;
    }

    // Insert at first
    public void insertFirst(int value) {
        Node node = new Node(value, head);
        head = node;
        size++;
    }

    // Insert at last
    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(value);
        size++;
    }

    // Insert at index
    public void insert(int index, int value) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // Display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Delete first
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    // Delete last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = head;
        for (int i = 0; i < size - 2; i++) {
            secondLast = secondLast.next;
        }

        int val = secondLast.next.value;
        secondLast.next = null;
        size--;
        return val;
    }

    // Delete at index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // Find node by value
    public Node find(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }
}
