import java.util.*;

class main{
    void wAnRSum(int a, int b){
        a = a+b;
        System.out.println("Sum : "+a);
    }

    int wAwRSub(int a, int b){
        a = a-b;
        return a;
    }

    static void vikash(){
        int a = 10;
        int b = 2;
        System.out.println(a^b);
        // System.out.println(a&b);
    }



    void nAnRHii(){
        System.out.println("THis is java code");
    }

    static void tarun(){
        int a = 999;
        int b = (int)Math.log10(a)+1;
        System.out.println(b);
    }



    int nAwR(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        return a+12;
    }




    static void mul(int a, int b){
        //a = a*b;
        System.out.println("Multi : "+a*b);
    }




    static void quo(int a, int b){
        System.out.println("Divi : "+a/b);
    }




    static void areaOfRec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Len : ");
        int a = sc.nextInt();
        System.out.println("Enter Bre : ");
        int b = sc.nextInt();

        System.out.println("Area Of Rect : "+a*b);
    }




    static void areaOfCir(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = sc.nextInt();
        double a  = 3.14*(r*r);
        System.out.println("AreOfCircle : "+a);
    }




    static void stuDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        float arr[] = new float[5];
        float tot = 0;
    
        for(int i = 0; i < arr.length-1; i++){
            
            System.out.print("Enter Sub" +i+ " Mark : ");
            arr[i] = sc.nextFloat();
            tot = tot + arr[i];
        }
        float avg = tot/arr.length;

        System.out.println("Tot : "+tot+" Average : "+avg);
    }


    static void squCube(int a){
        double squ = a * a;
        double cube = a * a * a;

        System.out.println("Squ : "+squ);
        System.out.println("Cube : "+cube);
    }


    void hrToMinToSec(float a){
        float min = a*60;
        float sec = min*60;

        System.out.println("Hours : "+a+" | Minutes : "+min+" | Seconds : "+sec);
    }

    static void swap(int a, int b){
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("A : "+a);
        System.out.println("B :"+b);

    }



    static void secToMinToHr(int a){
        float min = a/60;
        float hr = a/3600;

        System.out.println("Sec : "+a);
        System.out.println("Min : "+min);
        System.out.println("Hr : "+ hr);
    }


    static void sepa(int a){
        int b = a;
        int c = 0;
        while(b != 0){
            c = b % 10;
            //System.out.println(c);
            b = b/10;
        }
    }



    static void greatOf3(float a, float b, float c){
        if(a>c && a>b){
            System.out.println("A is greater");
        }
        else if(b>c && b>a){
            System.out.println("B is greater");
        }

        else{
            System.out.println("C is Greater");
        }
    }


    static void checkVolCont(char z){
        if(z == 'a' || z == 'A'){
            System.out.println("Vowel");
        }
        else if(z == 'e' || z == 'e'){
            System.out.println("Vowel");
        }
        else if(z == 'i' || z == 'I'){
            System.out.println("Vowel");
        }
        else if(z == 'o' || z == 'O'){
            System.out.println("Vowel");
        }
        else if(z == 'u' || z == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }



    static void leapYear(int a){
        if(a % 4 == 0 || a % 100 == 0){
            System.out.println(a+" is leap");
        }
        else{
            System.out.println(a+" is not leap");
        }
    }

    static void diviBy3And5(int a){
        if(a % 3 == 0 && a % 5 == 0){
            System.out.println(a+" is divible both 3 and 5");
        }
        else if(a % 3 == 0){
            System.out.println(a+" is divisible by 3 only");
        }
        else if(a % 5 == 0){
            System.out.println(a+" is divisible by 5 only");
        }
        else{
            System.out.println(" Not Divisible by two nos.  ");
        }
        
    }

    static void simCalcu(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Add");
        System.out.println("Press 2 for Sub");
        System.out.println("Press 3 for Mul");
        System.out.println("Press 4 for Divi");
        System.out.print("Enter num to Select Operator : ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                a = a+b;
                System.out.println("Addition : "+a);
                break;
            case 2:
                int c = a-b;
                System.out.println("Subtraction : "+c);
                break;
            case 3:
                System.out.println("Multiplication : "+a*b);
                break;
            case 4:
                System.out.println("Division : "+a/b);
                break;
        
            default:
                break;
        }
    }


    static void isTriangle(int a, int b, int c){
        
        

        System.out.println(a+" "+b+" "+c);

        // if(a + b < c){
        //     System.out.println("It is triangle");
        // }
        // else{
        //     System.out.println("Not a Triangle");
        // }
    }

    static String isEquIsoSca(int a, int b, int c){
        if(a == 0 || b == 0 || c == 0){
            return "Enter Non-zero Sides values";
        }
        else{
            if(a == b && b ==c){
            return "---Triangle is Equlateral---";
        }
        else if(a == b || b == c || c == a){
            return "---Triangle is Isosceles---";
        }
        else if(a != b && b != a && a != c){
            return "---Triangle is Scalene---";
        }
        }
        return "null";
    }

    static void elecBil(int a){
        int bill = 1;
        if(a >= 1 && a <= 200){
            bill = 0 * a;
            System.out.println("Bill Amt : "+bill);
        }
        else if(a > 200 && a <= 300){
            bill = 2 * a;
            System.out.println("Bill Amt : "+bill);
        }
        else if(a > 300 && a <= 500){
            bill = 4 * a;
            System.out.println("Bill Amt : "+bill);
        }
        else if(a > 500 && a <= 700){
            bill = 6 * a;
            System.out.println("Bill Amt : "+bill);
        }
    }
    void countDigi(int a){
        int count = 0;
        int temp = Math.abs(a);
        if(temp == 0){
            System.out.println(1);
        }
        else{
            while(temp > 0){
                temp = temp / 10;
                count = count + 1;
            }
            System.out.println("No of Didgit : "+count);
        }
    }

    static void sumOfDigit(int a){
        int sum = 0;
        int b = 0;
        while(a > 0){
            b = a % 10;
            sum = sum + b;
            a = a /10;
        }
        System.out.println(sum);
    }

    static int rev(int a){
        int b = 0;
        int revv=0;
        while(a > 0){
            b = a % 10;
            revv = revv *10 + b;
            a = a/10;
        }
        return revv;
    }

    static void compound(int mon){
        long tot = 1000;
        long inc = 1000;

        for(int i = 2 ; i <= mon ; i++){
            inc = inc + inc;
            tot = tot + inc;
        }
        System.out.println("At "+mon+"th Month : "+inc);
        System.out.println("Total Amount till "+mon+" month :"+tot);
    }

    static void maxOfDigi(int a){
        int lar = 0;
        int b = 0;
        while(a != 0){
            b = a % 10;
            if(b > lar){
                lar = b;
            }
            a = a / 10;
        }
        System.out.println("Large Num : "+lar);
    }

    static void countOddEven(int n){
        int b = 0;
        int eveCount = 0;
        int oddCount = 0;
        while(n != 0){
            b = n % 10;
            if(b % 2 == 0){
                eveCount++;
            }
            else{
                oddCount++;
            }
            n = n / 10;
        }
        System.out.println("Odd count : "+oddCount);
        System.out.println("Even Count : "+eveCount);
    }

    static void factorOfNumN(int a){
        int c = 0;
        int lar = 0;
        System.out.println("Factors are : ");
        for(int i = 1 ; i <= a; i++){
            if(a % i == 0){
                System.out.println(i);
                c++;
            }
        }
    }

    static void countOfFactorsOfN(int a){
        int c = 0;
        int lar = 0;
        for(int i = 1; i <= a ; i++){
            if(a % i == 0){
                System.out.println(i);
                c++;
            }
        }
        if(c > lar){
            lar = c;
        }
        System.out.println("Factor Count of "+a+" is : "+ c);
        System.out.println("Lar :"+lar);
        System.out.println();
    }

    static boolean nIsPrimeOrNot(int n){
        boolean state = true;
        if(n < 2){
            return false;
        }
        else{
            for(int i = 2; i < n; i ++){
            if(n % i == 0){
                state = false;
                //System.out.println("hhhhhh");
                break;
            }
        }
    }
    return state;
    }

    static void printPrime(int a){

    }

    static void sumOfEvenDigi(int a){
        int b = 0;
        int sum = 0;
        int temp = a;
        while(temp != 0){
            b = temp % 10;
            if(b % 2 == 0){
                sum = sum + b;
            }
            temp = temp / 10;
        }
        System.out.println("Sum of Even No. in digit "+a+" is :"+sum);
    }


    static void productOfDigi(int a){
        int b = 0;
        int prod = 1;
        while(a != 0){
            b = a % 10;
            prod = prod * b;
            a = a /10;
        }
        System.out.println("Product of own digit : "+prod);
    }

    static void freqOfDigi(int digi, int freq){
        int b = 0;
        int c = 0;
        while(digi != 0){
            b = digi % 10;
            if(b == freq){
                c++;
            }
            digi = digi / 10;
        }
        System.out.println(c);
    }

    static void countZeroInDigi(int a){
        int b = 0;
        int c = 0;

        while(a != 0){
            b = a % 10;
            if(b == 0){
                c++;
            }
            a = a /10;
        }
        System.out.println(c);
    }

    static void removeZeroFrDigi(int a){
        int b = 0;
        int rev = 0;
        while(a != 0){
            b = a % 10;
            if(b != 0){
                rev = rev * 10 + b;
            }
            a = a/10;
        }
        int rev1 = 0;
        int rev2 = 0;
        while(rev != 0){
            rev1 = rev % 10;
            rev2 = rev2 * 10 + rev1;
            rev = rev / 10;
        }
        //System.out.println(rev);
        System.out.println(rev2);
    }

    static boolean armstrongNo(int a){
        int b = 0;
        int s = 0;
        int temp = a;
        while(temp != 0){
            b = temp % 10;
            s = s + (b*b*b);
            temp = temp / 10;
        }
        if(a == s){
            return true;
        }
        return false;
    }

    static boolean perfectNum(int a){
        int b = 0;
        for(int i = 1; i < a ; i++){
            if(a % i == 0){
                b = b + i;
            }
        }
        if(a == b){
            return true;
        }
        return false;
    }

    static void shyam(){
        int a = Short.MAX_VALUE;
        System.out.println(a);
    }


//214,74,83,647

public static void selfDividingNumbers(int left, int right) {
        int b = 0;
        Set<Integer> setNum = new LinkedHashSet<>();
        for(int i = left; i <= right; i++){
            int temp = i;
            while(temp != 0){
                b = temp % 10;
                if(b == 0){
                    break;
                }
                else if(i % b != 0){
                    break;
            }
            if(temp >= 1 && temp <= 9){
                setNum.add(i);
            }
            temp = temp / 10;
            
        }
            
        }
        System.out.println(setNum);
    }

    public static void checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i < num ; i++){
            if(num % i == 0){
                System.out.println(i);
            }
            //System.out.println("S : "+sum);
        }

    }

    static void checkStrongNum(int a){
        int n = a;
        int b = 0;
        int sum = 0;
        System.out.println("hhhh");
        while(n != 0){
            b = n%10;
            sum = sum + fact(b);
            n = n / 10;
        }
        if(sum == a){
            System.out.println("Strong Num");
        }
        else{
            System.out.println("Not a Strong Num");
        }

    }
    static int fact(int a){
        int prod = 1;
        for(int i=1; i <= a; i++){
                prod = prod * i;
        }
        return prod;
    }

    static void printStrongNum(int a){
        int n = a;
        int b = 0;
        int sum = 0;
        while(n != 0){
            b = n%10;
            sum = sum + fact(b);
            n = n/10;
        }
        if(a == sum){
            System.out.println(a);
        }
    }
    static void checkAutomorphic(int a){
        int b = (a*a) % 10;
        System.out.println(b);
        int temp = 0;
        temp = a % 10;
        if(temp == b){
            System.out.println("automorphic");
        }
        else{
            System.out.println("Not A Automorphic");
        }
    }

    static void squareTab(int a){
        System.out.println(a+" : "+a*a);
    }


    public static void main(String[] args) {
        main ob = new main();
        
        //ob.nAnRHii();

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // char s = sc.next().charAt(0);
        // System.out.print("Enter A : ");
        // int a = sc.nextInt();

        // System.out.print("Enter B : ");
        // int b = sc.nextInt();

        // System.out.print("Enter c : ");
        // int c = sc.nextInt();

        // ob.wAnRSum(a,b);
        // int c = ob.wAwRSub(a,b);
        // System.out.println("Subtraction : "+c);

        // int d = ob.nAwR();
        // System.out.println(d);

        // mul(a,b);
        // quo(b,a);

        //areaOfRec();

        //areaOfCir();

        //stuDetails();

        //squCube(a);


        //ob.hrToMinToSec(a);

        //swap(a,b);

        //secToMinToHr(a);

        //sepa(a);


        //greatOf3(1/2,1/3,1/4);

        //checkVolCont(s);

        //leapYear(b);

        //diviBy3And5(b);

        //simCalcu(a,b);

        //isTriangle(a, b, c);

        // String tri = isEquIsoSca(a, b, c);
        // System.out.println(tri);

        //elecBil(a);

        //ob.countDigi(a);
        //sumOfDigit(a);
        //System.out.println(rev(a));

        //compound(a);

        //maxOfDigi(a);

        //countOddEven(a);
        // for(int i = 1 ; i <= 10; i++){
        //     System.out.println("Factors of "+i+" are");
        //     //factorOfNumN(i);
        //     countOfFactorsOfN(i);
        // }

        // for(int i = 1 ; i <= a; i++){
        //        System.out.println("The Num "+ i +" : " +(nIsPrimeOrNot(i)?"Prime Num":"Not a Prime"));
        // }

        //sumOfEvenDigi(a);

        //productOfDigi(a);

        //freqOfDigi(a, b);

        //printPrimeTillN(a);

        //countZeroInDigi(a);

        //removeZeroFrDigi(a);
        // print if armstrong No.
        // for(int i = 0; i < a ; i++){
        //     if(armstrongNo(i)){
        //         System.out.println(i);
        //     }
        // }

        // System.out.println((perfectNum(a)?"Perfect Num..!!":"Not Perfect Num"));
        // System.out.print("The Perfect Nums Are : ");
        // for(int i = 1; i <= a; i++){
        //     if(perfectNum(i)){
        //         System.out.print(i+", ");
        //     }
        // }
        // System.out.println();

        // factorOfNumN(a);
        //selfDividingNumbers(a,b);

        // checkPerfectNumber(a);

        //checkStrongNum(a);
        // System.out.println("The Strong Num are : ");
        // for(int i = 0; i < a; i++){
        //     printStrongNum(i);
        // }
        //System.out.println(264);5040  40320
        
        // checkAutomorphic(a);

        // for(int i = 1; i < a; i++){
        //     squareTab(i);
        // }

        // shyam();
        // vikash();
        tarun();
        
    }
}

