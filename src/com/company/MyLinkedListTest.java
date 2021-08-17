package com.company;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkList ll = new MyLinkList(10);
        ll.addFirst(11);
        ll.addFirst(22);
        ll.addFirst(33);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
