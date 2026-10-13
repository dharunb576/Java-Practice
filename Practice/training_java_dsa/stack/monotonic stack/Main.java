import java.util.*;

class Main{

    static void monoNxtGre(int[] arr, int a){
        Stack<Integer> s1 = new Stack<>();
        int res[] = new int[a];
        for(int i = a-1 ; i >= 0; i--){
            while(!s1.isEmpty() && s1.peek()<=arr[i]) {
				s1.pop();
			}
			if(s1.isEmpty()) {
				res[i]=-1;
			}
			else {
                
				res[i]=s1.peek();
			}
			s1.push(arr[i]);
		}
		System.out.print("Next largest number in the given array: ");
		for(int i=0;i<a;i++) {
			System.out.print(res[i]+" ");
		}
        System.out.println();
    }

    static void monoNxtSma(int[] arr, int a){

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count];

        for(int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }

        monoNxtGre(arr, count);
        monoNxtSma(arr, count);
        
    }
}