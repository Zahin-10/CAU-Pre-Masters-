package com.uri;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoublyLinkedElem e1 = new DoublyLinkedElem<Integer>(42,null,null);
        DoublyLinkedElem e2 = new DoublyLinkedElem<Integer>(44,e1,null);
        DoublyLinkedElem e3 = new DoublyLinkedElem<Integer>(43,e1,e2);
        DoublyLinkedElem e0 = new DoublyLinkedElem<Integer>(41,null,e1);

        System.out.println(e2.to_list());

//        e3.remove();
//
//        System.out.println(e1.to_list());
//
//        e0.remove();
//
//        System.out.println(e1.to_list());

    }
}
