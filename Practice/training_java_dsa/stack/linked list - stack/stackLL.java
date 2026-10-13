class stack{
    class node{
        int data;
        node next;

        node(int a){
            data = a;
            this.next = null;

        }  
    }
    node head = null;


    void push(int a){
        node nx = new node(a);
        if(head == null){
            head = nx;
            return;
        }
        nx.next = head;
        head = nx;
    }

    void pop(){
        if(head == null){
            System.out.println("Empty Stack");
        }
        head = head.next;
    }

    void peek(){
        if(head == null){
            System.out.println("Stack Empty");
        }
        System.out.println(head.data);
    }

    static void display(){
        node temp = head;
        while(temp != null){
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }
    }
}

class stackLL {
        public static void main(String[] args) {

        stack ob = new stack();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);      
        //ob.pop();
        ob.peek();
        ob.display();


    }
}
