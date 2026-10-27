import java.util.Scanner;

class pattern{
    public static void main(String[] args) {
        // p1();
        // n=5
        // 1
        // 33
        // 555
        // 7777
        // 99999

        floydTri();
        
}

        static void p1(){
        int n = 5;
        int z = 1;
        for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(z);
                }
                z = z+2;
                System.out.println();
            }
        }
        
        static void floydTri(){
            int n = 5;
            int z = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 0; j < i; j++){
                        System.out.print(z+" ");
                        z = z+1;
                }
                System.out.println();
            }
        }
}

