import java.util.*;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nums Count : ");
        int n = sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        
        System.out.println("Enter "+n+" Nums : ");
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            qu.add(val);
        }

        System.out.print("Enter k to revert : ");
        int s = sc.nextInt();

        Stack<Integer> sk = new Stack<>();

        for(int i = 0; i < s; i++){
            sk.push(qu.remove());
        }

        for(int i = 0 ; i<s; i++){
            qu.add(sk.pop());
        }

        for(int i = 0; i < n - s ; i++){
            qu.add(qu.remove());
        }
        System.out.println(qu);
    }

}


//op: 

// Enter Nums Count : 5
// Enter 5 Nums : 
// 1
// 2
// 3
// 4
// 5
// Enter k to revert : 3
// [3, 2, 1, 4, 5]