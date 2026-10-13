class douCir{
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int a){
            data = a;
            next = null;
            prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    void insertBeg(int a){
       
       
    }

    void insertEnd(int a){
        Node nn = new Node(a);

        if(head == null){
            head = tail = nn;
            
        }
    }

    void displayFor(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void displayBack(){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

public class cirDou {
    public static void main(String[] args){

        douCir cd = new douCir();

        cd.insertEnd(1);
        cd.insertEnd(2);
        cd.insertEnd(11);
        cd.insertBeg(4);
        cd.insertBeg(5);
        cd.insertBeg(6);

        cd.displayFor();
        cd.displayBack();
    }
}
