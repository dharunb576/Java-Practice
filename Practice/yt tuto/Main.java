// // public class Main{
// //     public static void main(String[] args) {
// //         //System.out.println("Hiii, This is Vignesh");

// //         short num = 32767;          // -32768 to 32767
// //         System.out.println(num);

// //         // short num1 = 32768;
// //         // System.out.println(num1);

// //         int num1 = -2147483648;      // -2147483648 to 2147483647
// //         System.out.println(num1);

// //         int num2 = 2147483647;      // -2147483648 to 2147483647
// //         System.out.println(num2);

// //         long num3 =  922337208;
// //         System.out.println(num3);


        
// //     }
// // }


// public class Main{
//     public static void main(String[] args) {

//         //implicit
//         //widening
//         //automatic convertion
//         int a = 10;
//         float b = a;
//         double c = b;
//         long d = a; 
//         // System.out.println(a);
//         // System.out.println(b);
//         // System.out.println(c);
//         // System.out.println(d);

//         //narrowing
//         //explicit

//         double e = 130;
//         byte f = (byte) e;
//         System.out.println(f);


//         //char can be converted in int
//         //char 16bit to 32 bit

//         //char charVal = '#';
//         char charVal = '!';
//         int intVal = charVal;
//         System.out.println(intVal);


//         //float to double 32bit to 64bit

//         // float floVal = 12.34f;
//         // double douVal = floVal;
//         // System.out.println(douVal);

//         // double douVal = 12.34089;
//         // float floVal = douVal;//it cause an error
//         // System.out.println(floVal);

//     }
// } 



// public class Main{
//     public static void main(String[] args) {
        
//         byte a = 12;
//         byte b = 15;
        
//         int z = a + b;
//         double y = a + b;

//         System.out.println(z);
//         System.out.println(y);
//     }
// }




//-----O-P-E-R-A-T-O-R-----

//Assignment 

// public class Main{
//     public static void main(String[] args) {
//         int x = 20;

//         // x *= 2;
//         // x /=5;
//         // x +=7;
//         // x %= 6;
//         // System.out.println(x);

//         // System.out.println(15%3);

//         // int a = 10;
//         // int b = 3;

//         // a += b * 2;
//         // System.out.println(a);
//         // b += a % 4;
//         // a -= b / 2;

//         // System.out.println(b);

//         int a = 24;
//         int b = 4;

//         System.out.println(a + b);
// System.out.println(a - b);
// System.out.println(a * b);
// System.out.println(a / b);
// System.out.println(a % b);


//         System.out.println(a / b + a % b * 2);

//         System.out.println(-10 % 3);
//         System.out.println(10 / 3);
// System.out.println(10.0 / 3);
// System.out.println(10 % 3);
//System.out.println(-10 / 3);


            //int z = 10;
            //System.out.println(z++);
            // System.out.println(++z);
            // System.out.println(z--);
            // System.out.println(--z);
            
//     }
// }

// byte	sc.nextByte()
// short	sc.nextShort()
// int	sc.nextInt()
// long	sc.nextLong()
// float	sc.nextFloat()
// double	sc.nextDouble()
// char	sc.next().charAt(0)
// boolean	sc.nextBoolean()
// String (one word)	sc.next()
// String (full line)	sc.nextLine()




// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the NUM : ");
//         int num = sc.nextInt();
//         switch(num){
//             case 1:
//                 System.out.println("1");
//                 break;
//             case 2:
//                 System.out.println("2");
//                 break;
//             case 3:
//                 System.out.println("3");
//                 break;
//             case 4:
//                 System.out.println("4");
//                 break;
//             case 5,6,7,8:
//                 System.out.println("This Num is 5 or 6 or 7 or 8");
//                 break;
            
//             default:
//                 System.out.println("--- Enter Valid Num ---");
//         }


//     }
// }


// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the NUM : ");
//         int num = sc.nextInt();
//         switch(num){
//             case 1 ->
//                 System.out.println("1");
                
//             case 2 ->
//                 System.out.println("2");
                
//             case 3 ->
//                 System.out.println("3");
                
//             case 4 ->
//                 System.out.println("4");
                
//             case 5,6,7,8->
//                 System.out.println("This Num is 5 or 6 or 7 or 8");
                
            
//             default ->
//                 System.out.println("--- Enter Valid Num ---");
//         }


//     }
// }

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter A :");

//     }
// }

//////------HASHSET AND HASHMAP-----////////

// import java.util.*;


// class Main{
//     public static void main(String[] args) {
        
//         HashSet<Integer> SET = new HashSet<>();

//         SET.add(10);
//         SET.add(20);
//         SET.add(10);

//         System.out.println(SET);

//         HashMap<Integer, String> map = new HashMap<>();

//         map.put(10,"Apple");
//         map.put(30,"Banana");
//         map.put(20,"Orange");

//         System.out.println(map.get(30));

//     }
// }



// class Main{
//     public static void main(String[] args) {
//         char a = 'B';
//         String name = "apple";
//         System.out.println(a);
//         System.out.println(name.charAt(1));
//         System.out.println(name.length());
//         int bab = (int) name;
//         System.out.println(bab);
//     }
// }




// class Main{
//     public static void main(String[] args) {
        
//         String a = "Apple";
//         //System.out.println(a);
//         int len = a.length();
//         int low = 0;
//         int mid = low + ((len-1)-low)/2;
        

//         for(int i = 0; i < len; i++){

            
//             char b = a.charAt(i);
//             System.out.print(b+" ");
//             if(i == len-1){
//                     System.out.println();
//             }
//         }
        
//         System.out.println(mid);
//     }
// }



// class Main{
//     public static void main(String[] args) {
        
//         char nam1 = 'a';
//         char nam2 = 'b';
//         char nam3 = 'f';

//         int index1 = nam1 - 'a';
//         System.out.println(index1);

//         int index2 = nam2 - 'a';
//         System.out.println(index2);

//         int index3 = nam3 - 'a';
//         System.out.println(index3);
//     }
// }




// class Main{
//     public static void main(String[] args) {
        
//         int[] arr = {1,2,3};

//         System.out.print("[");

//         for(int i = 0; i < arr.length; i++){

//             System.out.print(arr[i]);
//             if(i != arr.length-1){
//                 System.out.print(",");
//             }
//         }
//         System.out.println("]");
        

//     }
// }



// class Main{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};

//         // for(int val : arr){
//         //     System.out.println(val);
//         // }

//         System.out.println(Arrays.toString(arr));
//     }
// }

////-----Array Copying------////
// class Main{
//     public static void main(String[] args) {
//         int[] arrA = {1,2,3,4};
//         int[] arrB = arrA;
//         System.out.println("A--->"+Arrays.toString(arrA));
//         arrB[0] = 5;
//         System.out.println("A--->"+Arrays.toString(arrA));
//         System.out.println("B--->"+Arrays.toString(arrB));
//     }
// }



////-----Actual Array Copying------////

// class Main{
//     public static void main(String[] args) {
//         int[] arrA = {1,2,3,4,5};
//         int[] arrB = Arrays.copyOf(arrA,arrA.length);

//         System.out.println(Arrays.toString(arrB));
//     }
// }


////----Array Comparison---////

// class Main{
//     public static void main(String[] args) {
//         int[] arrA = {1,2,3,4,5};
//         // int[] arrB = Arrays.copyOf(arrA,arrA.length);
//         int[] arrB = {1,2,3,4,5};
//         System.out.println(Arrays.equals(arrA,arrB));
//         System.out.println(Arrays.toString(arrA));
//         System.out.println(Arrays.toString(arrB));
//     }
// }



////-----Array Sort----////


// class Main{
//     public static void main(String[] args) {
//         int[] arr = {23,45,1,34,45,76,3,56,53};
//         Arrays.sort(arr);

//         System.out.println(Arrays.toString(arr));
//     }
// }



/////-----Array Searching----/////

// class Main{
//     public static void main(String[] args) {
//         int[] arrA = {1,2,3,4,5};
       
//         int index = Arrays.binarySearch(arrA,2);
//         System.out.println(index);
// }
// }



///----Array Filling----////

// class Main{
//     public static void main(String[] args) {
//         int[] arrA = {0,0,0,0,0,0};

//         Arrays.fill(arrA,10);

//         System.out.println(Arrays.toString(arrA));
//     }
// }


// import java.util.*;

// /////----Array Reverse-----////


// class Main{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
        
//         int[] arrA = input(sc);
        
//         rever(arrA);
//         System.out.println(Arrays.toString(arrA));

//     }
//     public static void rever(int[] arr) {

//         Arrays.sort(arr);
//         int left = 0;
//         int right = arr.length-1;

//         while(left < right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

        
//     }

//     public static int[] input(Scanner sc) {
//         //Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int[] arr = new int[num];
//         for(int i = 0; i < num; i++){
//             arr[i] = sc.nextInt();
//         }
//         return arr;
//     }
// }



///////--------remove element------///////

// class Main{
//     public static void main(String[] args) {

//         int[] nums = {1,2,3,3,4,4,4,5,5,6,7};
//         int val = 4;
//         Main obj = new Main();

//         int newLen = obj.removeElement(nums,val);
//         System.out.println(newLen);
//     }
// public int removeElement(int[] nums, int val) {
        
//         int[] exNums = new int[nums.length]; 
//         int j = 0;
//         for(int i = 0; i < nums.length; i++){
            
//             if(val != nums[i]){
//                 exNums[j] = nums[i]; 
//                 j++;
//             }
//         }
//         return j;
//     }
// }




/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
        
//         int i = 0;
//         while(i < 500){
//             System.out.print(i+",");
//             if(i % 5 == 0){
//                 System.out.println();
//             }
//             i++;
//         }
//     }
// }

import java.util.Scanner;

/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
        
//         for(int i = 0 ; i < 8; i++){
//             if(i % 2 == 0){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }




class Main{

    static int dam(int a){
        return a+3;
    }
    public static void main(String[] args) {
        //Main ob = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ker = dam(a);
        System.out.println(ker);
        
    }
}