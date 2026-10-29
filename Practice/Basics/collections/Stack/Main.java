import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Integer> stc = new Stack<>();

        // -- to check the stack is empty---
        System.out.println(stc.empty());
        
        // --- to add the elements in the stack---
        for(int i = 5; i < 30 ; i+=5){
            stc.push(i);
        }
        System.out.println(stc);


        // --- to remove the elements from the stack from end or last----
        System.out.println(stc.pop());
        stc.pop();
        System.out.println(stc);

        // --- to show the top elements---
        System.out.println(stc.peek());

        System.out.println(stc.empty());


        // to return the size of the Stack
        System.out.println(stc.size());

        
        stc.add(100);
        stc.add(67);
        
        // --- to return the index from top n to end 1
        /*
        67 -- 1
        100 -- 2
        15 -- 3
        10 -- 4
        5 -- 5
        */
        System.out.println("peek -- > "+stc.search(67));
        System.out.println(stc.search(10));
        System.out.println(stc.search(15));

        System.out.println(stc.peek());
        System.out.println(stc);

        // -- to check the the Stack Contains the value --
        System.out.println(stc.contains(10));
    }   
}
