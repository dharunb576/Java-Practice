class Node{
    int data;
    Node next;
        Node(int a){
            data = a;
            next = null;
        }
    }

class stackLL{
    Node top = null;

    void push(int d){
        Node nn = new Node(d);

        if(top == null){
            top = nn;
            return;
        }
        nn.next = top;
        top = nn; 
    }

    int pop(){
        if(top == null){
            System.out.println("Stack Is Empty");
        }
        top = top.next;
        return top.data;
    }

    void peek(){
        if(top == null){
            System.out.println("Stack Empty");
        }
        System.out.println();
        System.out.println(top.data);
    }

    void isEmpty(){
        if(top == null){
            System.out.println("List is Empty");
        }
        System.out.println("Not Empty");
    }

    void display(){
        if(top == null){
            System.out.println("List Is Empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }
        return;
    }
}

class stMain{
    public static void main(String[] args) {
        stackLL ob = new stackLL();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);

        ob.display();

        System.out.println("Poped element : "+ob.pop());
        ob.display();

        ob.peek();
        ob.isEmpty();

    }

    
}