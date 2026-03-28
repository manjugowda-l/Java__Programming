package com.manju.LinkedList;

public class Main {
     static void main( ) {

        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(5);
        list.insert(1, 15);

        list.display();   // 20 -> 15 -> 10 -> 5 -> END

//        list.deleteFirst();
//        list.deleteLast();
//        list.delete(1);
//
//        list.display();   // 15 -> END

//        System.out.println(list.find(15));
        list.insertRec(88,2);
        list.display();
    }
}
