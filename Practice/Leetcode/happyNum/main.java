import java.util.*;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(checkHappy(a)){
            System.out.println("Happy");
        }
        else{
            System.out.println("Not happy");
        }
    }
    
    static boolean checkHappy(int n){
        int temp = val(n);
        if(temp == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    static int val(int a){
        int sum = 0;
        int b = 0;
        int temp = a;
        int r = 0;
        while(temp != 0){
            b = temp % 10;
            sum = sum + (b*b);
            temp = temp / 10;
        }
        if(sum > 1){
            val(sum);
        }
        return r;
    }
}