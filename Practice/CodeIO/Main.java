
//         }
//         else{
//             System.out.println("Enter num.");
//         }
//     }
// }



/*********************PLACEMENT TRAINING**********************/

//PROBLEM (1) 

//Sum of the Digit

// import java.util.Scanner;
// class main{

//     public static void main(String[] args) {
//         int s=0;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter No:");  
//         int n = obj.nextInt();
//         while(n>0){
//         int a = n%10;
//         n = n/10;
//         s=s+a;
//         }
//         System.out.println(s);
//     }
// }

/******************using function******************/
//PROGRAM 2
//Sum of the Digit

// import java.util.Scanner;
// class main
// {
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter No:");
//         int n = obj.nextInt();
//         System.out.println("Sum of the Digit:"+fun(n));
//     }
//     public static int fun(int n)
//     {
//     int s=0,a;
//      while (n>0) { 
//         a=n%10;
//         s=s+a;
//         n=n/10;
//         }
//         return s;
//     }
    
// }

/******PRINTING ALL THE NUM IN THE DIGIT********/


// import java.util.Scanner;
// class check{

//     public static void main(String[] args)
//     {
//         System.out.print("Enter NUM:");
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         check.sep(n);
//     }

//     public static void sep(int n)
//     {
//         while(n>0)
//         {
//             int a = n%10;
//             System.out.println(a);
//             n=n/10;
//         }
//     }
// }





/*****************REVERSING THE NUM IN THE DIGIT**************/


// import java.util.Scanner;
// class check{
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter Num: ");
//         int n = obj.nextInt();
//         rev(n);
//     }
//     public static void rev(int n)
// {
//         int a,r=0;
//         while(n>0)
//         {
//             a = n%10;
//             r=(r*10)+a;
//             n=n/10;
//         }
//         System.out.print(r);
//     }
// }



/*************PRINT THE NUM IN THE DIGIT IN ORDER**************/

// class main{

//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter Num :");
//         int n = obj.nextInt();
//         int y=rev(n);
//         print(y);
//     }

//     public static int rev(int n)
//     {
//         int a,r=0;
//         while(n>0)
//         {
//             a=n%10;
//             r=(r*10)+a;
//             n=n/10;
//         }
//         return r;
//     }
//     public static void print(int n)
//     {
//         int num;
//         while(n>0)
//         {
//             num = n%10;
//             System.out.println(num);
//             n=n/10;
//         }

//     }

// }

 /*********************COUNTING OF NUM OF DIGIT *****************/              
                                                                                

// class main
// {
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);

//       double i=0;  
//       System.out.print("Enter Num: ");
//       int n = obj.nextInt();
//       while(n>0)
//       {
//             n=n/10;
//             i=i+1;
//       }
//       System.out.print(i);
//     }
// }


/*******************Same By Using the function********************/
/***************Here by Using void and print****************** */


// class main{

//   public static void main(String[] args)
//   {
//       int n;
//       Scanner obj = new Scanner(System.in);
//       System.out.print("Enter Num: ");
//       n = obj.nextInt(); 
//       count(n);   
//      
//   }

// public static void count(int n)
// {
// int i=0;
//   while(n>0)
//   {

//     n=n/10;
//     i=i+1;

//   }
//   System.out.print("NUM OF DIGIT: "+i);

//   }
// }


/*******************Same By Using the function********************/
/******************Here by using int and return*************************/


// class main{

//   public static void main(String[] args)
//   {
//       int n;
//       Scanner obj = new Scanner(System.in);
//       System.out.print("Enter Num: ");
//       n = obj.nextInt();    
//       System.out.print("NUM OF DIGIT: "+count(n));
//   }

// public static int count(int n)
// {
// int i=0;
//   while(n>0)
//   {

//     n=n/10;
//     i=i+1;

//   }
//   return i;

//   }
// }




/**************Same program but in not static method**************/


// class main{

//   public static void main(String[] args)
//   {

//     Scanner obj = new Scanner(System.in);
//     main ob = new main();

//     System.out.print("Enter Num: ");
//     int n = obj.nextInt();
//     System.out.print("NUM OF DIGIT: "+ob.count(n));//like here

//   }

// public double count(int n)         //here we didn't use static keyword///just while printing add object of the main class
// {
//   double i=0;
//   while(n>0)
//   {
//     n=n/10;
//     i++;
//   }
//   return i;
// }
// }



// class check{
//     public static void main(String[] args) {
//         for(int i=0; i<8; i++){
        
//         char b = '*';
//         char a = (char)(b * i);
//         System.out.println(a);
//         } 
//     }
// }


/***************POWER VALUE OF THE NUMBER*******************/
/***********IN MAIN FUNCTION***********/

// class main
// {
// public static void main(String[] args) {
    
//     Scanner obj = new Scanner(System.in);

//     System.out.print("Enter Base Num: ");
//     int b = obj.nextInt();
//     System.out.print("Enter Power Num: ");
//     int p = obj.nextInt();
//     int soln=1;

//     for(int i=0; i<p; i++)
//     {
//       soln=soln*b;
//     }
// System.out.print("Answer : "+soln);
// }

// }



// /***********SAME PROGRAM USING FUNCTION***********8*/


// class main
// {
// public static void main(String[] args) {
    
//     Scanner obj = new Scanner(System.in);

//     System.out.print("Enter Base Num: ");
//     int b = obj.nextInt();
//     System.out.print("Enter Power Num: ");
//     int p = obj.nextInt();

//     System.out.println("Answer: "+power(b,p));
// }

// public static int power(int b, int p)
// {
// int soln=1;

//     for(int i=0; i<p; i++)
//     {
//       soln=soln*b;
//     }
// return soln;
// }

// }



/***************using function without static method****************/
/***************power of the number using void method*********************************************** */


// import java.util.*;
// class check{
//     public static void main(String[] staff){
//         Scanner obj = new Scanner(System.in);

//         System.out.print("base:");
//         int base=obj.nextInt();

//         System.out.print("expo:");
//         int expo=obj.nextInt();

//         new check().fun(base, expo);
//     }
//     public  void fun(int base, int expo){
//         int result = 1;
//         for(int i = 1; i<=expo;i++){
//             result = result*base;
//         }
//         System.out.print(result);
//     }
// }



/****************ADD UNTIL num BECOME SINGLE DIGIT********************/
/*************SUM OF THE NUMBER***************/
/*************IN MAIN FUNCTION**************/
/********************WRONG UNDERSTANDING************************ */


// class main{

//   public static void main(String[] args) {
      
//       Scanner obj = new Scanner(System.in);
//       int a=0;
//       int i=0;

//           System.out.print("Enter NUM:");
//           int n=obj.nextInt();
//           while(n>0)
//           {
//               a=n%10;
//               i=i+a;
//               n=n/10;
//           }
//         System.out.print("Sum of the Digit: "+i);

//   }

// }



/****************SUM UNTIL BECOME SINGLE DIGIT*****************/
/****************CORRECT CODE NOT USING THE STATIC KEYWORD*****************/

//import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter NUM : ");
//         int n = s.nextInt();
//         System.out.print(new main().fun(n));
//     }
//     public  int fun(int n){
//         while(n > 9){
//             n=sumof(n);
//         }
//         return n;
//     }
//     public static int sumof(int n){
//         int s=0;
//         while(n>0){
//             int d = n%10;
//             s = s+d;
//             n=n/10;
//         }
//         return s;
//     }
// }


/*************AMSTRONG NUM DETECTION****************/
/***************NOT COMPLETED******************/

// class main{

//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter Num : ");
//         int n = obj.nextInt();
//     }
//     public static int sep(int n)
//     {
//         int i=0;
//         int a=0;
//         while(n>0)
//         {
//             a=n%10;
//             i=i+1;
//             n=n/10;
//         }
//         return i;
//     }
//     public static void ams(int n) {
//         nod = sep(n);
//         int se = 0;

//     }

// }



/****************BINARY TO DECIMAL***************/
/************BY USING FUNCION********************/
/**************BUT HAVE FIX SOMING********************/

// class main{

//     public static void main(String[] args) {
        
//             Scanner obj = new Scanner(System.in);

//             System.out.print("Enter Binary NUM : ");
//             int n = obj.nextInt();

//             System.out.print("The Decimal Num is : "+bin(n));

//     }
//     public static int bin(int n)
//     {
//         int sum = 0;
//         int pow = 1;
//         int y = 0;
//         while(n>0)
//         {
//             y=n%10;
//             sum=sum+(pow*y);
//             n=n/10;
//             pow=pow*2;
//         }
//         return sum;
//     }
// }


/**********DECIMAL TO BINARY*************/

// import java.util.Scanner;
// class main
// {
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter Num: ");
//         int a = obj.nextInt();

//         System.out.print("THE BINARY NUM : "+dtb(a));

//     }
//     public static int dtb(int n)
//     {
//         int sum = 0;
//         int k = 1;
//         while(n>0)
//         {
//             int z= n%2;
//             sum=sum+(z*k);
//             k=k*10;
//             n=n/2;
//         }
//         return sum;
//     }

// }



/**************BINARY ADDITION****************/
/************WORK FLOW ->BTD ->ADD -> DTB************/
// {
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);

//         System.out.print("Enter Binary NUM_1 : ");
//         int n1 = obj.nextInt();

//         System.out.print("Enter Binary NUM_2 : ");
//         int n2 = obj.nextInt();

//         n1=btd(n1);
//         n2=btd(n2);
//         int  a1=n1+n2;
//         System.out.println("Decimal value of NUM1: "+n1);
//         System.out.println("Decimal value of NUM2: "+n2);
//         System.out.println("DECIMAL VALUE AFTER ADDITION : "+a1);
//         System.out.println("Binary Addition Result: "+dtb(a1));


//     }

//     public static int btd(int n)
//     {
//         int sum =0;
//         int pow =1;
    
//         while(n>0)
//         {
//             int y=n%10;
//             sum=sum+(pow*y);
//             n=n/10;
//             pow=pow*2;
//         }
//         return sum;
//     }

//     public static int dtb(int n)
//     {
//         int sum = 0;
//         int k = 1;
//         while(n>0)
//         {
//             int z= n%2;
//             sum=sum+(z*k);
//             k=k*10;
//             n=n/2;
//         }
//         return sum;
//     }
// }




/**************PRIME OR NOT****************/
/***************method not used***************/

// class main{
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);

//         System.out.print("Enter Num : ");
//         int n = obj.nextInt();

//         boolean isprime = true;

//         for(int i = 2 ; i < n ; i++)
//         {
//             if(n%i==0)
//             {
//                 isprime = false;
//                 break;
//             }
//         }
//         if(isprime && n != 1)
//         {
//             System.out.println(n+" is a Prime Num.");
//         }
//         else{
//             System.out.println(n+" is Not a Prime.");
//         }
//     }
// }



/**************PRIME OR NOT****************/
/***************method used***************/


// class main
// {
//     public static void main(String[] args)
//     {
        
        // Scanner obj = new Scanner(System.in);

        // System.out.print("Enter Num : ");
        // int n = obj.nextInt();
//         boolean a = prime(n);
//         if(n == 1)
//         {
//             System.out.print("1 is either a prime num or a composite num.");
//         }
//         else if(a)
//         {
//             System.out.print(n+" is a prime num.");
//         }

//         else{
//             System.out.print(n+" is not a prime num.");
//         }
//     }
//         public static boolean prime(int n)
//         {
//                 boolean isprime = true;

//                 for(int i=2; i<n; i++)
//                 {
//                     if( n % i == 0)
//                     {
//                         isprime = false;
//                         break;
//                     }
//                 }
//                 return isprime;
//         }
// }


/******************PRINTING PRIME NUM IN RANGE******************/
/******************NEED TO FIX*********************/

// class main{

//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);

//         System.out.print("Enter lower : ");
//         int l = obj.nextInt();

//         System.out.print("Enter upper : ");
//         int u = obj.nextInt();
//         int a;
//         for(int i=l;i<=u;i++)
//         {
//             a=i;

//         }


//     }

// }




/*******************INTRO TO ARRAY***************************/


// class main{

//     public static void main(String[] args) {
        
//         Scanner osi = new Scanner(System.in);

        // System.out.print("Enter Size Of the Array: ");
        // int n = osi.nextInt();

        // int[] arr = new int[n];

//         for(int i = 0; i < n; i++)
//         {
//             System.out.print("Enter value : ");
//             arr[i]= osi.nextInt();
//         }
//         for(int j = 0; j < n; j++)
//         {
//             System.out.println(arr[j]);
//         }

//     }

// }



/*****************MAX VALUE OF ARRAY********************/
/******************WITHOUT METHOD*************************/

// import java.util.Scanner;
// class main
// {
//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);

        // System.out.print("Enter Size Of the Array: ");
        // int n = obj.nextInt();

        // int[] arr = new int[n];

//         int max = 0;

//         for(int i = 0; i<n; i++)
//         {
//             System.out.print("Enter Array Values : ");
//             arr[i]= obj.nextInt();
//         }
//         for(int j=0 ; j<n;j++)
//         {
//             if(arr[j]>max)
//             {
//                 max = arr[j];
//             }
//         }
//         System.out.println("Max Value Of Array: "+max);
//     }
// }





/***************MAX VALUE OF ARRAY*****************/
/**************WITH METHOD*****************/


// class main
// {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter Size Of the Array: ");
//         int n = obj.nextInt();

//         int[] arr = new int[n];
//         arr = get(arr);
//         max = max(arr);
//         System.out.println(max);
//     }

//     public static int get(int arr)
//     {
//         for(int i = 0 ; i<n ; i++)
//         {
//             System.out.println("Enter Array Value : ");
//             arr[i] = obj.nextInt();
//         }
//         return arr;
//     }
//     public static int max(int arr)
//     {
//                 int max = 0;
//                 for(int j = 0 ; j<n; j++)
//                 {
//                     if(arr[i]>max)
//                     {
//                         max = arr[j];
//                     }
//                 }
            
//             return max;
//     }
// }


/********************reversing the array********************/

// import java.util.Scanner;
// public class main
// {
//     public static void main(String args[]){
    
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no of elements in the array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter Array Value : ");
//         for(int i=0;i<n;i++){
            
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Reversed Array : ");
//         for(int j = n-1 ; j >= 0 ; j--)
//         {
//            System.out.print(arr[j]+" ");
//         }
//     }
        
//     }


/***************TWO POINTER CONCEPT****************/
/****************SWAPPING THE VALUES BY TWO POINTERS*******************/

// class main{

//     public static void main(String[] args) {
//         int[] arr = {2,3,4,5,6,4};
//         int i=0;
//         int j=arr.length - 1;
//         while(i<j)
//         {
//             int temp= arr[i];
//             arr[i]= arr[j];
//             arr[j]= temp;
            
//             i++;
//             j--;
//         }
        
//         for(int k=0; k<arr.length; k++)
//         {
//                 System.out.print(arr[k]+" ");
//         }
//     }
// }



/***************BUBBLE SORT******************/
// class main{
//     public static void main(String[] args) {
//         int[] arr = { 2, 6, 4, 8, 3, 1};
//         Bubble_Sort(arr);
//     }
//     public static void Bubble_Sort(int[] arr){
//         for (int i = 0; i < arr.length - 1; i++) {
//             for(int j = 0; j < arr.length - i; j++){
//                 if(arr[j] > arr[j + 1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



//DAY 4

/************************RECURSION FUNCTION*****************************/


// public class main{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter number1:");
//         int a=s.nextInt();
//         System.out.print("Enter number2:");
//         int b=s.nextInt();
//         System.out.print(recursion(a, b));
//     }
//     public static int recursion(int a, int b){
//         if(a*b != 0){
//             return 3+recursion(2,0)+recursion(6,0);
//         }
//         return a+b;
//     }
// }




/********************************FACTORIAL OF GIVEN NUMBER USING RECURSION****************************************** */


// public class main{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the factorial of number:");
//         int n=s.nextInt();
//         System.out.print("Result: "+factorial(n));
//     }
//     public static int factorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         return n*factorial(n-1);

//     }
// }



/*********************************RECURSION WITH BACKTRACKING*************************************************/


// public class main{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n=s.nextInt();
//         Backtrack(n);
//     }
//     public static void Backtrack(int n){
//         if(n==0){
//             return;
//         }
//         Backtrack(n-1);
//         System.out.println(n + " ");
//     }
// }



/*********************************FIBONACCI OF GIVEN NUMBER USING RECURSION*****************************************/


// public class main{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the fibonacci of number:");
//         int n=s.nextInt();
//         System.out.print(fibonacci(n));
//     }
//     public static int fibonacci(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         return fibonacci(n-1)+fibonacci(n-2);
//     }
// }




/***************************CLIMBING STAIRS WAYS TO REACH DESTINATION USING RECURSION*******************************/


// public class main{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the destination:");
//         int n=s.nextInt();
//         System.out.print("Number of possible ways to reach destination:"+climbingstairs(n));
//     }
//     public static int climbingstairs(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         return climbingstairs(n-1)+climbingstairs(n-2);
//     }
// }




/****************************MERGE TWO SORTED ARRAY********************************/


// public class main{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter first array size:");
//         int n=s.nextInt();
//         System.out.print("Enter first array:");
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=s.nextInt();
//         }
//         System.out.print("Enter second array size:");
//         int m=s.nextInt();
//         System.out.print("Enter second array:");
//         int[] b=new int[m];
//         for(int j=0;j<m;j++){
//             b[j]=s.nextInt();
//         }
//         Mergetwosortedarray(a, b, n, m);
//     }
//     public static void Mergetwosortedarray(int[] a, int[] b, int n, int m){
//         int i=0;
//         int j=0;
//         while(i<n && j<m){
//             if(a[i] < b[j]){
//                 System.out.print(a[i]+" ");
//                 i++;
//             }
//             else{
//                 System.out.print(b[j]+" ");
//                 j++;
//             }
//         }
//         while(i<n){
//             System.out.print(a[i]+" ");
//             i++;
//         }
//         while(j<m){
//             System.out.print(b[j]+" ");
//             j++;
//         }
//     }
// }




/******************************/


/*******MERGING ?????*******/

// public class main{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print ("Enter number of elements in an array:");
//         int n=s.nextInt();
//         System.out.print("Enter unsorted array:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=s.nextInt();
//         }
//         Mergesort(arr, 0, n-1);
//     }
//     public static void Mergesort(int arr[], int l, int h){
//         if(l==h){
//             return;
//         }
//         int mid=(l+h)/2;
//         Mergesort(arr, l, h);
//         Mergesort(arr, mid+1, h);
//         Merge(arr,l,mid,h);
//     }
//     public static void Merge(int arr[], int l, int mid, int h){
        
//     }

// }




/*************     STRING    ******************/



// // class main{

// //     public static void main(String[] args) {
// //         String s = new String("Apple");
// //         System.out.println(s);

// //         s = "hello";
// //         System.out.println(s);
// //     }
// // }


// class main{


//     public static void main(String[] args) {
        
//         Scanner obj = new Scanner(System.in);

//         String wr = obj.nextLine();
//         StringBuffer s = new StringBuffer(wr);
//         s.reverse();


//         if(wr.equals(s))
//         {
//             System.out.println("Palindrome");
//         }
// else{
//     System.out.println("Not a Palindrome");
// }
//     }


// }



/**********************   OOPS CONCEPT    *************************/

// class tom {

//     public void sreesh() {
//         System.out.println("HIIII SREESH");
//     }
// }
//     class vikash {
//         public void parthi() {
//             System.out.println("Hii Parthi");
//         }
//     }

//     class main {
//         public static void main(String[] args) {
//             tom p = new tom();
//             vikash s = new vikash();

//             p.sreesh();
//             s.parthi();

//         }
//     }




/************        USING EXTENT IN CLASS         **************/

// class c1{
//     public void m1(){
//         System.out.println("Hii Srii");
//     }
// }
// class c2 extends c1{
//     public void m2()
//     {
//         System.out.println("Hii Viks");
//     }
// }
// class main{
//     public static void main(String[] args) {
//         c2 s = new c2();
//         s.m1();
//         s.m2();
//     }
// }




/*****************  INHERITANCE   *******************/
/**************       MULTI LEVELING      ************/

// class c1{
//     public void m1(){
//         System.out.println("Hii Srii");
//     }
// }
// class c2 extends c1{
//     public void m2()
//     {
//         System.out.println("Hii Viks");
//     }
// }

// class c3 extends c2{
//     public void m3(){
//         System.out.println("Hii parthi");
//     }
// }

// class main{
//     public static void main(String[] args) {
//         c3 s = new c3();
//         s.m1();
//         s.m2();
//         s.m3();
//     }
// }




/*************      USING CONSTRUCTOR     *************/
    
    
// class Person {
//     Person() {
//         System.out.println("Person constructor");
//     }
//     void nationality() {
//         System.out.println("Indian");
//     }
// }

// class Employee extends Person {
//     Employee() {
//         System.out.println("Employee constructor");
//     }
//     void organization() {
//         System.out.println("IBM");
//     }
// }

// class Manager extends Employee {
//     Manager() {
//         System.out.println("Manager constructor");
//     }
//     void subordinates() {
//         System.out.println("12 subordinates");
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Manager m = new Manager();
//         m.nationality();     // from Person
//         m.organization();    // from Employee
//         m.subordinates();    // from Manager
//     }
// }


// void add(int a, int b)->parameters
// s.o.p(add(2,3))->arguments



/**************        METHOD OVERLOADING         *************/

/*********    IN ONE CLASS [SAME METHOD NAME BUT DIFFERS IN COUNT OF PARAMETER]               ***********/
/******************        IT AUTOMATICALLY CALLS THE METHOD BASED ON NUM OF AURGUMENTS         ******************/


// class viks{

//     int add(int a , int b)
//     {
//         return a+b;
//     }
//     int add(int a, int b, int c)
//     {
//         return a+b+c;
//     }
//     int add(int d1, int d2)
//     {
//         return d1+d2;
//     }
// }
//     class main{
//         public static void main(String[] args) {
//             viks obj = new viks();
//             System.out.println(obj.add(2,3,4));
//             System.out.println(obj.add(2,3));
//             System.out.println(obj.add(3763,9373));
//         }
//     }




/*******************        METHOD OVERRIDING       ********************/
/*******************     DIFF CLASS BUT SAME METHOD NAME    ********************/
/*******************        DIFFERS IN OBJECT CREATION FOR SPECIFIC CLASS       ********************/

// class c1{

//     public void m1()
//     {
//         System.out.println("M1 is Printed");
//     }
// }
// class c2 extends c1{
//     public void m1()
//     {
//         super.m1();
//         System.out.println("M2 is Printed");
//     }
// }
// class c3 extends c2{
//     public void m1()
//     {
//         super.m1();
//         System.out.println("M3 is Printed");
//     }
// }

// class main extends c3{

//     public static void main(String[] args) {
//         main ob = new main();
//         // c1 obj1 = new c1();
//         // c1 obj2 = new c2();
//         // c1 obj3 = new c3();

//         // obj1.m1();
//         // obj2.m1();
//         // obj3.m1();
//         ob.m1();

//     }
// }



/****************      ENCAPSULATON      ***************/


// class rn{
//         private int rollno;
//         public void setroll(int rollno)
//         {
//                 this.rollno = rollno;
//         }
//         public int getroll()1

//         {
//                 return rollno;
//         }

// }
// public class main{
//         public static void main(String[] args) {
            
//             rn in = new rn();
//             in.setroll(13);
//             System.out.println(in.getroll());
//         //  System.out.println(args[0] + args[1]);

//         }
// }



/********INTERFACE****CLASS*****IMPLEMENTS************/





// interface vignesh{

// }

// interface college extends {
//         int fees = 2500;
//        // void training();
// }
// public class main implements college{
//         public void training(){
//                 System.out.println("Student learning java programming");
//         }

//         public static void main(String[] args) {
            
//             main s=new main();
//             s.training();
//             System.out.print(college.fees);

//         }

// }
// class mythread extends Thread
// {
//         public void run()
//         {
//                      System.out.println("Function in extended class");
//         }
// }
// class main{
//         public static void main(String[] args) {
//         mythread obj = new mythread();
//         obj.start();
// }
// }



class main extends Thread{    
 public void run()
 {    
 	 for(int i=1;i<5;i++)
	{   
 	 // the thread will sleep for the 500 milli seconds   
		try
		{
		Thread.sleep(500);
                System.out.println(i);
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
                System.out.println("Exception handled");
		}    
  	System.out.println(i);    
  	}    
 }    
 public static void main(String args[])
 {    
  main t1=new main();    
  main t2=new main();    
  t1.start();    
  t2.start();    
 }    
}    



// class TestCallRun1 extends Thread{  
//  public void run(){  
//    System.out.println("running...");  
//  }  
//  public static void main(String args[]){  
//   TestCallRun1 t1=new TestCallRun1();  
//   t1.run();//fine, but does not start a separate call stack  
//  }  
// }


// import javax.swing.*;
// class main {
// main()
// {  
// JFrame f = new JFrame();    
// JLabel firstName = new JLabel("First Name");  
// firstName.setBounds(20, 50, 80, 20);  
  
// JLabel lastName = new JLabel("Last Name");  
// lastName.setBounds(20, 80, 80, 20);  
  
// JLabel dob = new JLabel("Date of Birth");  
// dob.setBounds(20, 110, 80, 20);  
  
// JTextField firstNameTF = new JTextField();  
// firstNameTF.setBounds(120, 50, 100, 20);  
  
// JTextField lastNameTF = new JTextField();  
// lastNameTF.setBounds(120, 80, 100, 20);  
  
// JTextField dobTF = new JTextField();  
// dobTF.setBounds(120, 110, 100, 20);  
  
// JButton sbmt = new JButton("Submit");  
// sbmt.setBounds(20, 160, 100, 30);  
  
// JButton reset = new JButton("Reset");  
// reset.setBounds(120,160,100,30);  
  
// f.add(firstName);  
// f.add(lastName);  
// f.add(dob);  
// f.add(firstNameTF);  
// f.add(lastNameTF);  
// f.add(dobTF);  
// f.add(sbmt);  
// f.add(reset);  
  
// f.setSize(300,300);  
// f.setLayout(null);  
// f.setVisible(true);  
// }  
  
// public static void main(String[] args) {  
// main s = new main();  
// }  
// }  
//


// import java.awt.*;
// import java.awt.event.*;

// public class Main implements ActionListener {
//     TextField tf;

//     Main() {
//         Frame f = new Frame("Action Event");

//         tf = new TextField();
//         tf.setBounds(50, 50, 150, 20);

//         Button b = new Button("Click");
//         b.setBounds(50, 100, 80, 30);
//         b.addActionListener(this);

//         f.add(b);
//         f.add(tf);

//         f.setSize(300, 300);
//         f.setLayout(null);
//         f.setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         tf.setText("Button Clicked");
//     }

//     public static void main(String[] args) {
//         new Main();
//     }
// }





// public class Main {   
// public static void main(String[] args) {
//         try {
//             int data=50/0;        
//         System.out.println("rest of the code"); 
//         } catch (Exception e) {
//                 System.out.println("Exception handled");
//         }
           
//     }        
// }  






// import java.io.FileWriter;
// import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String s1 ="hello java string";    
        System.out.println(s1.length());    
        System.out.println(s1); //Without trim()    
        String tr = s1.trim();    
        System.out.println(tr.length());    
        System.out.println(tr); //With trim()

    }
}