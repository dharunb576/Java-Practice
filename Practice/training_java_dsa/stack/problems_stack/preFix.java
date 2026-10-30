import java.util.Stack;

public class preFix {
       public static void main(String[] args) {
            Stack<Character> stc = new Stack<>();
            String str = "12/4+2*3-5";
            String ans = "";

            for(int i = str.length()-1; i >= 0; i--){
                char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    ans = ch + ans;
                }
                else{
                    if(!stc.empty() && priVal(stc.peek()) >= priVal(ch)){
                        ans = stc.pop() + ans;
                    }
                    stc.push(ch);
                }
            }
            while(!stc.empty()){
            ans = stc.pop() + ans;
       }
            System.out.println(ans);
            System.out.println(stc);
       }

       

       static int priVal(char c){
         if(c == '*' || c == '/' || c == '%'){
                return 2;
            }
            else if(c == '+' || c == '-'){
                return 1;
            }
            return 0;
       }
}
