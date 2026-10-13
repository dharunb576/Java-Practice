import java.util.Scanner;
import java.util.Stack;

class Main{

    static boolean find(String a){

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < a.length(); i++){

            if(a.charAt[i] == '[' || a.charAt[i] == '{' || a.charAt[i] == '('){
                stack.push(charAt[i]);
            }

            if(a.charAt[i] == ']' || a.charAt[i] == '}' || a.charAt[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
            
            else if(a.charAt[i] == ']' && stack.peek() == '[' || a.charAt[i] == '}' && stack.peek() == '{' ||a.charAt[i] == ')' && stack.peek() == '('){
                stack.pop(charAt[i]);
            }
            else{
                return false;
            }
        }
    }
    if(stack.isEmpty()){
        return true;
    }
    else{
        return false;
    }


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(find(s)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}