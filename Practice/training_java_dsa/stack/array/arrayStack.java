class stack{
        int ar[];
        int top;
        int size;

        stack(int a){
            size = a;
            ar = new int[size];
            top = -1;
        }

        void push(int a){
            if(top == size - 1){
                System.out.println("Overflow");
            }
            ar[++top] = a;
            System.out.print("Pushed Data "+ar[top]);
            System.out.println();
        }

        void pop(){
            if(top == -1){
                System.out.println("Underflow");
            }
            System.out.print("Poped Data "+ar[top]);
            top--;
         System.out.println();   
        }

        void peek(){
            System.out.println("Peek Data "+ar[top]);
        }

        void display(){

            System.out.print("Data In Stack :");
            for(int i = top; i >= 0 ; i--){
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }


public class arrayStack{
    public static void main(String[] args) {

        stack sA = new stack(10);

        sA.push(1);
        sA.push(2);
        sA.push(3);
        sA.push(4);
        sA.push(5);
        sA.display();
        sA.peek();
        sA.pop();
        sA.peek();
        sA.pop();
        sA.display();
        
    }
}
