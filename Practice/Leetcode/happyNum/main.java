import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int an = sc.nextInt();
    if(isHappy(an)){
        System.out.println("Happy num");
    }
    else{
        System.out.println("Not a Happy num");
    }
    }
    
    
    
static boolean isHappy(int n) {
        if(val(n) == 1){
            return true;
        }
        return false;
    }
    
    private static int val(int a){
        int sum = 0;
        int b = 0;
        int a1 = a;
        while(a1 != 0){
            b = a1 % 10;
            //System.out.println(b);
            sum = sum + (b*b);
            //System.out.println(sum);
            a1 = a1 / 10;
        }
        if(sum != 1){
            val(sum);
        }else{
            System.out.println(sum);
            return sum;
        }
        return 0;
    }
    
}