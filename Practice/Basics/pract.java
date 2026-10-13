
//     public static void main(String []args)
//     {
//         int n=10;
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> ls = new ArrayList<>();
//         System.out.print("nums = ");
//         while (true) { 
//             String input = sc.nextLine();

//             if(input.isEmpty())
//             {
//                 break;
//             }
//             int values = Integer.parseInt(input);
//             ls.add(values); 
//         }
//         System.out.print("target = ");
//         int target = sc.nextInt();
//         System.out.print(ls);
//     }
// }



// class Solution {
//     public String addBinary(String a, String b) {
        
//         int x = Integer.parseInt(a);
//         int y =Integer.parseInt(b);
//         System.out.print(x);
//                 System.out.print(y);

//         int z = x + y;
//         System.out.println(z);
//         return Integer.toBinaryString(z);
//     }
// }

// class pract{
//     public static void main(String[] args){
//         int[] nums = { 2, 7, 11, 15};
//         System.out.println(nums.length);
//         Solution ob = new Solution();
//         // System.out.println(ob.addBinary(11, 1));
//         String ans = ob.addBinary("11", "1");
//         System.out.println(ans);
//     }
// }




// class pract{
//     public static void main(String []args)
//     {
//         String sp = " ";
//         String st = "*";
//         int a=0;
//         for(int i = 5; i>=1; i--)
//         {
//             for(int j=1; j<=i ; j++)
//             {
//                 System.out.print(sp);
//             }
//             for(int k=0 ; k<=a;k++)
//             {
//                 System.out.print(st);
//             }
//             a=a+2;
//             System.out.println(" ");
//         }
//     }
// }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//     System.out.print("no of lines of star:");
//         int st = sc.nextInt();
//         int a = st;
//         for(int i = 1; i<=st; i++){
//             for(int j=1; j<=i ; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=a; k++)
//             {
//                 System.out.print("*");
                
//             }
//             a=a-2;
//             System.out.println();
//         }
//     }

// }





// class pract {
//     public static void main(String[] args) {
        
//         int[] order = {3,1,2,5,4};
//         int[] friends = {1,3,4};
//         int[] r = new int[friends.length];
//         for(int i=0; i<order.length;i++)
//         {
//             for(int j=0; j<friends.length;j++)
//             {
//                 if(order[i] == friends[j]){
//                     r[j] =order[i];
//                 }
//             }
//         }
//         for(int k=0; k< friends.length;k++)
//         {
//             System.out.print(r[k]+",");
//         }
//     }
// }



// class pract{
//     public static void main(String[] args) {
        
//         System.out.print("Hello");
//     }
// }

// class pract{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Num: ");
//         int a = sc.nextInt();
//         System.out.print("The Entered Num : "+a);

//     }
// }



// class pract{
//     public static void main(String[] args) {
//         Scanner ram = new Scanner(System.in);

//         System.out.print("Enter Num : ");
//         int n = ram.nextInt();

//         for(int i = 0;i < n; i++){
//             for(int j = 0; j<n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// OP: 
// ****
// ****
// ****
// ****


// class pract{
//     public static void main(String[] args) {
//         Scanner ram = new Scanner(System.in);

//         System.out.print("Enter Num : ");
//         int n = ram.nextInt();
//         int i;
//         int j;

//         for(i = 0;i < n; i++){
//             for(j = 1; j <= n; j++){
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
// }
// OP:
// Enter Num : 5
// 12345
// 12345
// 12345
// 12345
// 12345



// class pract{
//     public static void main(String[] args) {
//         Scanner ram = new Scanner(System.in);

//         System.out.print("Enter Num : ");
//         int n = ram.nextInt();
//         int i;
//         int j=0;

//         for(i = 0;i < n; i++){
//             for(j = 0; j < i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// OP:
// Enter Num : 5
// *
// **
// ***
// ****
// *****


// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;
//         int j;

//         for(i = 1;i <= n; i++){
//             for(j = 1; j <= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println("");
//         }
//     }
// }

// 1
// 12
// 123
// 1234
// 12345


// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;  //row
//         int j;  //col
//         int num = 1;

//         for(i = 1; i <= n; i++)
//         {
//             num = (i%2==0) ? 0:1; 
//             for(j=1; j<= i; j++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }
// op:
// 1
// 00
// 111
// 0000
// 11111


// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;  //row
//         int j;  //col
//         int num = 1;

//         for(i = 1; i <= n; i++)
//         {
//             num = (i%2==0) ? 0:1; 
//             for(j=1; j<= i; j++){
//                 System.out.print(num);
//                 num = (num == 0) ? 1:0;
//             }
//             System.out.println();
//         }
//     }
// }

// op:
// 1
// 01
// 101
// 0101
// 10101



// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;  //row
//         int j;  //col
//         int num = 1;
//         int n1 = 0;

//         for(i = 1; i <= n; i++)
//         { 
//             for(j=1; j<= i; j++){
//                 System.out.print(num+" ");
//                 num = num + 1;
                
//             }
//             System.out.println();
//         }
//     }
// }

// OP:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;
//         int j;

//         for(i = 1;i <= n; i++){
//             for(j = 1; j <= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println("");
//         }
//     }
// }

// op:
// 1
// 22
// 333
// 4444
// 55555


// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;  //row
//         int j;  //col
//         int num = 1;
//         int n1 = 0;

//         for(i = n; i >= 1; i--)
//         { 
//             for(j=1; j<= i; j++){
//                 System.out.print("*");
                
//             }
//             System.out.println();
//         }
//     }
// }
// op:
// *****
// ****
// ***
// **
// *

// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;  //row
//         int j;  //col
//         int num = 1;
//         int n1 = 0;

//         for(i = n; i >= 1; i--)
//         { 
//             for(j=1; j<= i; j++){
//                 System.out.print(j);
                
//             }
//             System.out.println();
//         }
//     }
// }
// op:
// 12345
// 1234
// 123
// 12
// // 1

// class pract{
//     public static void main(String[] args) {
//         //Scanner ram = new Scanner(System.in);

//         //System.out.print("Enter Num : ");
//         int n = 5;
//         int i;  //row
//         int j;  //col
//         int k;
//         int num = 1;
//         int n1 = 0;

//         for(i = 1; i <= n; i++)
//         { 
//             for(j=n; j >= 1; j--){
//                 System.out.print(" ");
//             }
            
//             System.out.println();
//         }
//     }
// }


import java.util.*;
/**
 * pract
 */
public class pract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int av = sc.nextInt();

        boolean a = true;

        if(av < 2){
            a = false;
        }

        for(int i = 2; i < av; i++){
            if(av % i == 0){
                a = false;
                break;
            }
        }
        System.out.println((a)?"prime":"not a prime");
    }
}