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

    void insert(int a){
        Node nn = new Node(a);
        if(head == null){
            head = tail = nn;
            nn.next = head;
            return;
        }
        nn.prev = tail;
        tail.next = nn;
        tail = nn;
       
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

public class doubly {
    public static void main(String[] args){

        douCir cd = new douCir();

        cd.insert(1);
        cd.insert(2);
        cd.insert(11);
        cd.insert(4);
        cd.insert(5);
        cd.insert(6);

        cd.displayFor();
        cd.displayBack();
    }
}
