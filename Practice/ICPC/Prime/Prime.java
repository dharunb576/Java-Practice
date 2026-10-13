// import java.util.*;

// public class Prime {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         ArrayList <Integer> arr = new ArrayList<>();
//         int temp = 0;
//         arr.add(2);

//         int num = sc.nextInt();
//         if(num % 2 == 0){
//             System.out.println("Enter Valid Prime Num");
//         }
//         else{
//             for(int i = 1; i <= num; i++){

//                 for(int j=1; j <= num ; j++){
//                     if(i % j == 0){
//                         break;
//                     }
                    
//                 }
//         }
//         System.out.println(arr);
//         }
        
//     }
// }



import java.util.*;

public class Prime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        // int temp = 0;
        // arr.add(2);

        int num = sc.nextInt();

        if(num < 2){
                System.out.println("Enter num above 2 ");
        }
        else{
        arr.add(2);
        for(int i = 3; i <= num; i+=2){
            if(isPrime(i)) 
                {
                    //System.out.print(" "+i);
                    arr.add(i);

                }
            }
        System.out.println(arr);

        for(int j = 0; j < arr.size() ; j++){
            
        }
    }
}

public static boolean isPrime(int n){
    for(int j = 3; j < n; j+=2){
        if(n % j == 0){
            return false;
        }
    }
    return true;
}

}