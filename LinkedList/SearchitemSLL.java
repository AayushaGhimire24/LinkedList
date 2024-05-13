package LinkedList;


import LinkedList.SLL;
import LinkedList.SLLNode;

//WRITE A JAVA FUNCTION TO SEARCH AN ITEM IN SLL.
//WRITE A JAVA FUNCTION TO PRINT THE DATA OF DLL IN REVERSE ORDER.
class SLLNode{
int info;
SLLNode next;
}
class SLL{
    SLLNode first,last;
    public void insertFirst(int data){
     SLLNode newnode=new SLLNode();
     newnode.info=data;
     if(first==null){
         first=newnode;
         last=newnode;
     }
     else{
         newnode.next=first;
         first=newnode;
     }
 }
 public void insertLast(int data){
     SLLNode newnode=new SLLNode();
     newnode.info=data;
     if(last==null){
         first=newnode;
         last=newnode;
     }else{
         last.next=newnode;
         last=newnode;
     }
 }
 public  void search(int data){
     int x=0;
     boolean isfound=false;
     if(first==null)
         System.out.println("Empty List");
     else
     {
         SLLNode temp=first;
         while(temp!=null){
             x++;
             if(temp.info==data){
             System.out.print("search successful ") ;
             isfound=true;
                 System.out.print("Data found at node:"+x);
                 break;
             }
             temp=temp.next;
     }
         if(isfound==false)
         System.out.print("data doesnot exist");
 }
     
 }     public  void display(){
     if(first==null)
         System.out.println("Empty List");
     else
     {
         SLLNode temp=first;
         while(temp!=null){
             System.out.print(temp.info+" ");
             temp=temp.next;
     }
         System.out.println();
 }
 }
}
public class SearchitemSLL {
    public static void main(String[] args) {
        SLL myList=new SLL();
         myList.insertFirst(5);
        myList.insertFirst(6);
        myList.display();
        myList.insertLast(8);
        myList.insertLast(9);
        myList.search(5);
       myList.display();
    }
}

