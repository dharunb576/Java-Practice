import java.util.*;

class main{
    public static void main(String[] args) {
        main ob = new main();
        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter : ");
        // int a = sc.nextInt();
        //ob.discountOffer(amt);
        //transportFareCalcu(a);
        
        // secondLar();

        // moveZeroToEnd();

        // search();

        sort();

        //bubbleSort();

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
        int[] arr = {10, 5, 12, 40, 8, 20, 30, 50, 45};
        int lar = 0;
        int secLar = 0;
        for(int i = 1; i < arr.length; i++){
               if(arr[i] > lar){
                secLar = lar;
                lar = arr[i];
               }
               else if(lar > secLar && arr[i] > secLar){
                secLar = arr[i];
               }
        }
        System.out.println(lar);
        System.out.println(secLar);
    }


    static void moveZeroToEnd(){
        int[] arr = {1,0,5,3,4,7,0,0,4};
        int[] newArr = new int[arr.length];
        int c = 0;
        int j = 0;
        for(int a : arr){
            System.out.print(a+" ");
        }
       
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println();
        for(int b : newArr){
            System.out.print(b+" ");
        }
        System.out.println();
    }

    static void search(){
        int[] arr = {10,20,30,40,50};
        int a = 30;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == a){
                System.out.println(i);
            }
    }
    }

    static void sort(){
        int[] arr = {20, 10, 30, 60, 40, 70};
        Arrays.sort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }

     
    static void bubbleSort(){
        int[] arr = {20, 10, 30, 60, 40, 70};

        for(int i = 1; i < arr.length; i++){
            
            // if(arr[i-1]){

            // }
        }
    }
}