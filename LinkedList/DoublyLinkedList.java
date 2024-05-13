package LinkedList;

class DLLNode{
    int info;
    DLLNode next,previous;
}
class DLL{
    DLLNode first,last;
    public void insertFirst(int data){
        DLLNode newnode=new DLLNode();
        newnode.info=data;
        if(first==null){
            first=newnode;
                    last=newnode;
        }else{
            newnode.next=first;
            first.previous=newnode;
            first=newnode;
        }
            
    }
    public void insertLast(int data){
        DLLNode newnode=new DLLNode();
        newnode.info=data;
     if(last==null){
         first=newnode;
         last=newnode;
    }else{
         newnode.previous=last;
         last.next=newnode;
         last=newnode;
 
     }
}
    public void deleteFirst(){
         if(first==null){
         System.out.println("Empty list");
     }
     else if(first==last){
         first=null;
         last=null;
 }else{
         DLLNode temp=first;
         first=first.next;
         first.previous=null;
         temp.next=null;
                 
     }
    }
          public void deleteLast(){
     if(last==null){
         System.out.println("Empty list");        
     }
     else if(last==first){
         last=null;
         first=null;        
     }else{
         DLLNode temp=last.previous;
     last.previous=null;
         last=temp;
         last.next=null;
     }      
 }     
          public void insertAt(int data,int pos){
     DLLNode newnode=new DLLNode();
     newnode.info=data;
     if(first==null){
     first=newnode;
     last=newnode;
 }else{
         //find previous node of given position
         DLLNode temp=first;
         for(int i=1;i<pos-1;i++){
             temp=temp.next;
         }
         newnode.next=temp.next;
         temp.next=newnode;
         newnode.previous=temp;
         newnode.next.previous=newnode;
     }
     
 }
          public void deleteAt(int data ,int pos){
      if(first==null){
         System.out.println("Empty list");
     }
     else if(first==last){
         first=null;
         last=null;
 }else{
         DLLNode temp=first;
         for(int i=1;i<pos-1;i++){
             temp=temp.next;
         }
             DLLNode cur=temp.next;
             temp.next=cur.next;
             cur.next.previous=temp;
             cur.next=null;
             cur.previous=null;
         
     }
     }
     public  void display(){
     if(first==null)
         System.out.println("Empty List");
     else
     {
         DLLNode temp=first;
         while(temp!=null){
             System.out.print(temp.info+" ");
             temp=temp.next;
     }
         System.out.println();
     }
}
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL myList=new DLL();
         myList.insertFirst(5);
        myList.insertFirst(6);
        myList.display();
        myList.insertLast(8);
        myList.insertLast(9);
        myList.display();
         myList.deleteFirst();
        myList.display();
myList.deleteLast();
        myList.display();
         myList.insertAt(50,2);
        myList.display();
        myList.deleteAt(50,2);
        myList.display();

    }
}
