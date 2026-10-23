class sing{
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
            
        }
    }
    void insertBeg(int d){
        Node nn = new Node(d);
        nn.next = head;
        head = nn;
    }

    void display(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}



public class pract{
    public static void main(String[] args) {
        sing ob = new sing();
        
        ob.display();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insert(5);
        ob.display();
    }
}