import java.util.Scanner;

class Main{

    static void gen(String s, int a){
        if(s.length() == a){
            System.out.println(s);
            return ;
        }
        gen(s+"0",a);
        gen(s+"1",a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Bin digit size : ");
        int a = sc.nextInt();
        gen("", a);
    }
}