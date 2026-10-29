import java.util.Stack;

public class popLetBefVowel {
    public static void main(String[] args) {
        String inp = "abocdefi";

        Stack<Character> stc = new Stack<>();
        String vowl = "AEIOUaeiou";

        for(int i = 0; i < inp.length(); i++){
            char ch = inp.charAt(i);
            String sss = ch +"";

            if(stc.isEmpty()){
                stc.push(ch);
            }
            else if(vowl.contains(sss)){
                stc.pop();
                stc.push(ch);
            }
            else{
                stc.push(ch);
            }
        }
        System.out.println(stc);
        String sss = "";
        while(!stc.isEmpty()){
            char ch = stc.pop();
            sss = ch + sss ;
        }
        System.out.println(sss);
    }   
}
