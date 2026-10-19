import java.util.Scanner;

class main{
    public static void main(String[] args) {
        main ob = new main();
        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter : ");
        // int a = sc.nextInt();
        //ob.discountOffer(amt);
        //transportFareCalcu(a);
        
        secondLar();

    }
    void discountOffer(float a){

        float tot = 0;
            if(a >= 0 && a <= 1000){
                System.out.println("Total Amt : "+a);
            }
            else if(a >= 1001 && a <= 5000){
                tot = a - (a/100)*5;
                System.out.println("Total Amt : "+tot);
            }
            else if(a >= 5001 && a <= 10000){
                tot = a - (a/100)*10;
                System.out.println("Total Amt : "+tot);
            }
            else if(a > 10000){
                tot = a - (a/100)*15;
                System.out.println("Total Amt : "+tot);
            }
            else{
                System.out.println("---Enter Valid Amt---");
            }
    }

        static void transportFareCalcu(int a){
            int tot = 0;
            if(a > 0 && a <= 5){
                tot = a * 10;
            }
            else if(a <= 15){
                tot = 50 + ((a - 5) * 8);
            }
            else if(a > 15){
                tot = 130 + ((a-15) * 6);
            }
            else{
                System.out.println("---Enter Valid Km---");
            }
            System.out.println(tot);
    }

    static void secondLar(){
        int[] arr = {10, 5, 12, 40, 8, 20, 30};
        int lar = 0;
        int secLar = 0;
        for(int i = 1; i < arr.length; i++){
            if(i == 1){
            lar = arr[i-1];
            secLar = arr[i];
            if(secLar > lar){
                int temp = lar;
                lar = secLar;
                secLar = temp;
            }
            }
            if(arr[i] > lar){
                lar = arr[i];
            }
            if(lar < arr[i]){
                secLar = lar;
            }
        }
        System.out.println(lar);
        System.out.println(secLar);
    }
}