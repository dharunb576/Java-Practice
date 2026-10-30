import java.util.Stack;

public class postFix{
    public static void main(String[] args) {

        String str = "7*8/2+1/3*7+1";
        Stack<Character> stc = new Stack<>();

        String ans = "";
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                    ans = ans + ch;
            }
            else{
                
                while(!stc.empty() && priVal(stc.peek()) >= priVal(ch)){
                    ans = ans + stc.pop();
                }
                stc.push(ch);
            }
        }
        while(!stc.isEmpty()){
            ans = ans + stc.pop();
        }
        System.out.println(ans);
        System.out.println(stc);
    }   

    static int priVal(char a){
        if(a == '*' || a == '/' || a == '%'){
            return 2;
        }
        else if(a == '+' || a == '-'){
            return 1;
        }
        return 0;
    }
}