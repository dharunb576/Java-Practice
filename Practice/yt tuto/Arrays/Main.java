// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         int arr[];
//     arr = new int[4];
//     arr[0] = 3;
//     int i=0;
//     Scanner sc = new Scanner(System.in);
    
//     while(i < 4){
        
//         arr[i] = sc.nextInt();
//         i++;
//     }
//     System.out.println();
//     for(int oneByOne : arr){
        
//         System.out.println(oneByOne);
//     }
//     }
//}


/////----------Var Address printing code--------//////


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // Java/C# Example
// for (int i = 1; i <= 3; i++) {
//     int[] arr = new int[i]; // Size changes based on 'i'
//     System.out.println("Array length: " + arr.length);
//     System.out.println("Index Position : "+i);
//     int hashCode = System.identityHashCode(arr[i-1]);
        
//         // 2. Convert it to a Hexadecimal string (looks like a memory address)
//         String hexAddress = Integer.toHexString(hashCode);
        
//         System.out.println("Object Identity Hex: 0x" + hexAddress);
// }

//     }
// }

import java.util.Scanner;

class Main{

    void arrayScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Len : ");
        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Main ob = new Main();

        ob.arrayScanner();

    }
}