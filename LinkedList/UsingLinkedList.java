 package LinkedList;

import java.util.*;
public class UsingLinkedList {
    public static void main(String[] args) {
        LinkedList myList=new LinkedList();
        myList.addFirst(20);
        myList.addFirst(10);
        System.out.println(myList);
        myList.addLast(30);
        System.out.println(myList);
        myList.add(2,25);
        System.out.println(myList);
        myList.removeFirst();
        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);            
    }
}
