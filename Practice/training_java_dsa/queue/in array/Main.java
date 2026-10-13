import java.util.Scanner;

class queue{
    int ar[];
    int size;
    int front;
    int rear;


queue(int a){
    size = a;
    ar = new int[size];
    front = 0;
    rear = -1;
}


void enqueue(int d){
    if(rear == size -1){
        System.out.println("Overflow");
        return; 
    }
    ar[++rear]= d;
    System.out.println(d+" Pushed");
}


void dequeue(){
    if(rear == -1){
        System.out.println("Underflow");
    }
    System.out.println(ar[front]+" is Dequeued");
    front++;
    return;

}

void peek(){
    System.out.println(ar[front]+" is the Peek element");
}

void display(){
    for(int i = front; i <= rear; i++){
        System.out.println("Element in Queue : "+ar[i]);
    }

}
}
class Main{
    public static void main(String[] args) {
        queue ob = new queue(5);

        // Scanner sc = new Scanner(System.in);
        // int d = sc.nextInt();

        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        ob.enqueue(5);
        //ob.enqueue(6);
        ob.dequeue();
        ob.display();
        ob.peek();
        
    }
}