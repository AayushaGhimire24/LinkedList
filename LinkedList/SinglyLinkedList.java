  package LinkedList; 
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
     }else{
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
 public void deleteFirst(){
     if(first==null){
         System.out.println("Empty list");
     }
     else if(first==last){
         first=null;
         last=null;
 }else{
         first=first.next;
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
         SLLNode temp=first;
         while(temp.next!=last){
             temp=temp.next;
         }
         temp.next=null;
         last=temp;
     }      
 }
 public void insertAt(int data,int pos){
     SLLNode newnode=new SLLNode();
     newnode.info=data;
     if(first==null){
     first=newnode;
     last=newnode;
 }else{
         //find previous node of given position
         SLLNode temp=first;
         for(int i=1;i<pos-1;i++){
             temp=temp.next;
         }
         newnode.next=temp.next;
         temp.next=newnode;
     }
     
 }
 public void deleteAt(int pos){
      if(first==null){
         System.out.println("Empty list");
     }
     else if(first==last){
         first=null;
         last=null;
 }else{
         SLLNode temp=first;
         for(int i=1;i<pos-1;i++){
             temp=temp.next;
         }
             SLLNode cur=temp.next;
             temp.next=temp.next.next;
             temp.next=cur.next;
             cur.next=null;
         
     }
     }
 
 
 public  void display(){
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
public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL myList=new SLL();
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
        myList.deleteAt(2);
        myList.display();
    }

}
