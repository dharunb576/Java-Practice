
// class singleLL{
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }

class linkedList{

    int size = 0;

    Node head = null;
    void insertAtEnd(int a){
        Node nn = new Node(a);
        size++;
        Node temp;
        if(head == null){
            head = nn;
            return;
        }
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }temp.next = nn;
    }

    void insertAtBegin(int data){
        if(head == null){ 
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        head = newNode;
    }

    void insertPos(int data, int pos){
        Node nn = new Node(data);
        size++;
        if(pos == 1){
            insertAtBegin(data);
            return;
        }
        Node temp = head;
        for(int i =0; i < pos-2; i++){
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    void deleteAtEnd(){
        Node temp = head;
        if(temp.next == null){
            head = null;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    void deleteBeg(){
        if(head == null){
            System.out.println("Lis Empty");
            return ;
        }
        head = head.next;
        size--;
    }

    void deletePos(int pos){
            if(head == null){
                System.out.println("Empty");
            }
            else if(pos == 1){
                deleteBeg();
                return;
            }
            Node temp = head;
            for(int i = 0; i < pos-2; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
    }

    void deleteByValM1(int val){
        if(head == null){
            System.out.println("Head Empty");
            return ;
        }
        Node temp = head;
        while(temp != null){
                if(val == temp.next.data){
                    temp.next = temp.next.next;
                    size--;
                    return;
                }
                temp = temp.next;
        }
    }

    void deleteByValM2(int val){
        if(head == null){
            deleteByValM1(val);
        }
        Node temp = head;
        Node prevTemp = head;

        while(temp != null){

            if(val == temp.data){
                prevTemp.next = temp.next;
                size--;
            }

            prevTemp = temp;
            temp = temp.next;
        }
    }

    void deleteByValM3(int val){
        if(head == null){
            deleteByValM1(val);
        }
        Node temp = head;
        // Node prevTemp = head;

        while(temp != null){

            if(val == temp.data){
                temp.data = temp.next.data;
                temp.next = temp.next.next;
                size--;
            }

            // prevTemp = temp;
            temp = temp.next;
        }
    }

    Node reverse(){
        Node prev = null;
        Node temp = head;
        Node next = null;

        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
        
    }

    void display1(){
        if(head== null){
            System.out.println("List is Empty");
        }
        Node temp = head;
        System.out.println("Size : "+size);
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        
    }

    void display2(){
        Node reve = reverse();
        if(reve== null){
            System.out.println("List is Empty");
        }
        while(reve != null){
            System.out.print(reve.data+" ");
            reve = reve.next;
        }
        System.out.println();
    }

}

    
public class single{
    public static void main(String parthi[]) {
        linkedList obj = new linkedList();

        // obj.insertAtBegin(0);
        // obj.insertAtBegin(2);
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        // obj.insertAtEnd(3);
        // obj.insertAtEnd(4);
        // obj.insertAtEnd(5);


        // obj.insertPos(100, 3);
        // obj.insertPos(200, 5);

        obj.display1();

        // obj.deleteAtEnd();
        // obj.deleteAtEnd();
        // obj.display1();

        // obj.deleteBeg();
        // obj.deleteBeg();
        // obj.display1();

        // obj.deletePos(4);
        // obj.deletePos(1);
        // obj.display1();

        // obj.deleteByValM1(5);
        // obj.display1();

        // obj.deleteByValM2(3);
        // obj.display1();

        // obj.deleteByValM3(0);
        // obj.display1();

        obj.display2();

    }
}