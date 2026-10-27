class single{

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
                return;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = nn;
        }
        void insertBeg(int d){
            Node nn = new Node(d);
            nn.next=head;
            head=nn;
        }

        void sum(){
            Node temp = head;
            int even = 0;
            int odd = 0;
            while(temp != null){
                    if(temp.data % 2 == 0){
                        even = even + temp.data;
                    }
                    else{
                        odd += temp.data;
                    }
                    temp = temp.next;
            }
            System.out.println(even);
            System.out.println(odd);
            System.out.println();
        }
        
        void max(){
            int max=0;
            Node temp=head;
            while(temp!=null){
                if(max < temp.data){
                    max = temp.data;
                }
                temp = temp.next;
            }
            System.out.println(max);
        }

        void min(){
            int min=0;
            Node temp=head;
            while(temp!=null){
                if(min > temp.data){
                    min = temp.data;
                }
                temp = temp.next;
            }
            System.out.println(min);
        }


        void display(){
            if(head==null){
                System.out.println("List is empty");
            }
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        void insertByVal(int d, int val){
            Node temp = head;
            Node nn = new Node(d);
            while(temp != null){
                if(temp.data == val){
                    nn.next = temp.next;
                    temp.next = nn;
                    return;
                }  
                temp = temp.next;   
            }
            System.out.println("Invalid Num");
        }

        void deleteBeg(){
            if(head == null){
                System.out.println("No List Found");
            }
            head = head.next;
            return;
        }


        void deleteEnd(){
            
            if(head == null){
                System.out.println("No List Found");
                return;
            }
            if(head.next == null){
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;           
        }

        void insertPos(int d, int pos){
            if(pos==1){
                insertBeg(d);
            }
            Node nn = new Node(d);
            Node temp = head;
            for(int i=1;i<pos-1 && temp==null ;i++){
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next=nn;

        }

        void deletePos(int pos){
            if(pos == 1){
                deleteBeg();
            }
            Node temp = head;
            for(int i=1;i<pos-1 && temp.next != null ;i++){
                temp = temp.next;
            }
            if(temp.next == null) System.out.println("Position not Found");

            temp.next = temp.next.next;
            }


            void deleteByValue(int val){
                if(head.data == val){
                    deleteBeg();
                }
            Node temp = head;
                while(temp.next != null){
                    if(temp.next.data == val){
                        temp.next = temp.next.next;
                    }
                    temp = temp.next;
                }
            }
            void length(){
                Node temp = head;
                int count = 0;
                while(temp!=null){
                        count++;
                        temp = temp.next;
                }
                System.out.println(count);
            }

            void update(int val, int rep){
                Node temp = head;
                while(temp != null){
                    if(temp.data == val){
                        temp.data = rep;
                    }
                    temp = temp.next;    
                }
            }
            boolean search(int s){
                Node temp = head;
                while(temp != null){
                    if(temp.data == s){
                        return true; 
                    }
                    temp = temp.next;
                }
                return false;   
            }

        
    }

public class Main {
    public static void main(String[] args) {
        single ob = new single();
        ob.insert(100);
        ob.insert(200);
        ob.insert(300);
        ob.insert(400);
        ob.insert(500);
        ob.insert(600);
        
        //ob.insertBeg(10);
        
        //ob.insertPos(100,5);
        //ob.sum();
        
        // ob.max();
        // ob.min();
        //ob.insertByVal(5,1000);
        //ob.deleteBeg();
        //ob.deleteEnd();
        //ob.deletePos(6);
        //ob.deleteByValue(100);
        //ob.update(200, 700);
        ob.search(300);
        ob.display();
        //ob.length();
        
    }
}
