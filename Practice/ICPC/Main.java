import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<int[][]> boy = new ArrayList<>(); 
        ArrayList<int[][]> girl = new ArrayList<>(); 
        
        System.out.print("Enter Points Count : ");
        int num = sc.nextInt();
        System.out.print("Enter the 'B' & 'G' Pattern according to the count you Given : ");
        String form = sc.next();

        //Integer[] pos = new Integer[num]; 

       for(int i = 0; i < num ; i++){
        System.out.print("Enter 'X' Axis : " );
            int x = sc.nextInt();
        System.out.print("Enter Y Axis : ");
            int y = sc.nextInt();

            int[] pos = {x,y};


            if (form.charAt(i) == 'B'){
                boy.add(pos);
            }
            else{
                girl.add(pos);
            }
            }

            System.out.print("B-->[");
        for (int[] pos : boy) {
            System.out.print(Arrays.toString(pos));
        }
        System.out.println("]");
        System.out.print("G-->[");
        for (int[] pos : girl) {
            System.out.print(Arrays.toString(pos));
        }
        System.out.println("]");
    }

    public static arrSort()
}



