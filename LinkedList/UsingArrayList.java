package LinkedList;

import java.util.*;
public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList myList=new ArrayList();
        myList.add("Ram");
        myList.add("Hari");
        System.out.println(myList);
        myList.add(1,"Sita");
        System.out.println(myList);
        myList.remove(0);
        
        System.out.println(myList);
    }
}
/*we cannot useintegers because integer lai array ko index vanthanxa .so,we use text instead*/