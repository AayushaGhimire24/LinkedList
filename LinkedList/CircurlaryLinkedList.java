package LinkedList;
class CLLNode{
    int info;
    CLLNode next;
}
class CLL{
    CLLNode first,last;
     public void insertFirst(int data){
     CLLNode newnode=new CLLNode();
     newnode.info=data;
     if(first==null){
         first=newnode;
         last=newnode;
         last.next=first;
     }
    else{
         newnode.next=first;
         first=newnode;
         last.next=first;
     }
 }
     public void insertLast(int data){
     CLLNode newnode=new CLLNode();
     newnode.info=data;
     if(last==null){
         first=newnode;
         last=newnode;
         last.next=first;
     }else{
         last.next=newnode;
         last=newnode;
         last.next=first;
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
         last.next=first;
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
         CLLNode temp=first;
         while(temp.next!=last){
             temp=temp.next;
         }
         last.next=null;
         temp.next=first;
         last=temp;
     }      
 }
     public void insertAt(int data,int pos){
     CLLNode newnode=new CLLNode();
     newnode.info=data;
     if(first==null){
     first=newnode;
     last=newnode;
 }else{
         //find previous node of given position
         CLLNode temp=first;
         for(int i=1;i<pos-1;i++){
             temp=temp.next;
         }
         newnode.next=temp.next;
         temp.next=newnode;
     }
     
 }
 public void deleteAt(int data, int pos){
      if(first==null){
         System.out.println("Empty list");
     }
     else if(first==last){
         first=null;
         last=null;
 }else{
         CLLNode temp=first;
         for(int i=1;i<pos-1;i++){
             temp=temp.next;
         }
             CLLNode cur=temp.next;
             temp.next=cur.next;
             cur.next=null;
         
     }
     }
 
     public void display(){
         if(first==null)
             System.out.print("Empty list");
         else{
             CLLNode temp=first;
             while(temp!=last){
                 System.out.print(temp.info+" ");
                 temp=temp.next;      
             }
             System.out.println(temp.info);
         }
     }
}
public class CircurlaryLinkedList {
    public static void main(String[] args) {
        CLL myList=new CLL();
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
