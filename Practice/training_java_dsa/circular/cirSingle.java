import java.util.*;


class circular{

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;     
        }
    }
    Node head = null;
    
    void insert(int a){
        Node nn = new Node(a);
        if(head == null){
            head = nn;
            nn.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = nn;
        nn.next = head;

    }

    void insertBeg(int a){

        Node nn = new Node(a);
        if(head == null){
            head = nn;
            nn.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        nn.next = head;
        head = nn;
        temp.next = nn;
        
    }

    void deleteBeg(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next; 
    }

    void deleteEnd(){
        Node temp = head;

        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
    }

    void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp != head);
    }

    void deleteByVal(int a){

        Node temp = head;

        while(temp.next != head){
            if(temp.next.data == a){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
}


public class cirSingle{
    public static void main(String[] args) {
        circular ag = new circular();
        ag.insert(1);
        ag.insert(2);
        ag.insert(3);
        ag.insert(4);
        ag.insert(7);
        ag.insertBeg(5);
        ag.insert(6);
        ag.deleteBeg();
        ag.deleteEnd();
        ag.deleteByVal(4);
        ag.display();
        
    }
}