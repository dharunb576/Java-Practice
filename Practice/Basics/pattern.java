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

        // floydTri();
        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15
        
        // binaryTri();
        // 1
        // 01
        // 010
        // 1010
        // 10101

        // invertStar();
        // *****
        // ****
        // ***
        // **
        // *

        rightAngleTri();

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

        static void binaryTri(){
            int n = 5;
            int boo = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                        System.out.print((boo % 2 != 0)?"1":"0");
                        boo += 1;
                }
                System.out.println();
            }
        }

        static void invertStar(){
            int n = 5;
            for(int i = n; i > 0; i--){
                for(int j = 1; j <= i; j++){
                        System.out.print("*");
                }
                System.out.println();
            }
        }

        static void rightAngleTri(){
            int n = 5;
        }
}

