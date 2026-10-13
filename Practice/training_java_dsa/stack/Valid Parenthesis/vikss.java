// // If using a class, write your code in the 'Main' class
// import java.util.*;
// class vikss{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Stack<Character> stack=new Stack<>();
//         String s=sc.next();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
//                 stack.push(s.charAt(i));
//             }
//             if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']'){
//                 if(stack.isEmpty()){
//                     System.out.print("false");
//                     return;
//                 }
//                 else if(s.charAt(i)=='}' && stack.peek()=='{'||s.charAt(i)==']' && stack.peek()=='['||s.charAt(i)==')' && stack.peek()=='('){
//                     stack.pop();
//                 }
//                 else{
//                     System.out.print("false");
//                     return;
//                 }
//             }
//         }
//         if(stack.isEmpty()){
//             System.out.print("true");
//             return;
//         }
//         else{
//             System.out.print("false");
//         }
//     }
// }




class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s1=new Stack<>();
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		System.out.print("Enter array data: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] res=new int[n];
		for(int i=n-1;i>=0;i--) {
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
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
		
	}
}


//class Main{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		Stack<Integer> s1=new Stack<>();
//		System.out.print("Enter array size: ");
//		int n=sc.nextInt();
//		System.out.print("Enter array data: ");
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int[] res=new int[n];
//		for(int i=n-1;i>=0;i--) {
//			while(!s1.isEmpty() && s1.peek()>=arr[i]) {
//				s1.pop();
//			}
//			if(s1.isEmpty()) {
//				res[i]=-1;
//			}
//			else {
//				res[i]=s1.peek();
//			}
//			s1.push(arr[i]);
//		}
//		System.out.print("Next smallest number in the given array: ");
//		for(int i=0;i<n;i++) {
//			System.out.print(res[i]+" ");
//		}
//		
//	}
//}


//class Main{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		Stack<Integer> s1=new Stack<>();
//		System.out.print("Enter array size: ");
//		int n=sc.nextInt();
//		System.out.print("Enter array data: ");
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int[] res=new int[n];
//		for(int i=0;i<n;i++) {
//			while(!s1.isEmpty() && s1.peek()<=arr[i]) {
//				s1.pop();
//			}
//			if(s1.isEmpty()) {
//				res[i]=-1;
//			}
//			else {
//				res[i]=s1.peek();
//			}
//			s1.push(arr[i]);
//		}
//		System.out.print("previous largest number in the given array: ");
//		for(int i=0;i<n;i++) {
//			System.out.print(res[i]+" ");
//		}
//		
//	}
//}


//class Main{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		Stack<Integer> s1=new Stack<>();
//		System.out.print("Enter array size: ");
//		int n=sc.nextInt();
//		System.out.print("Enter array data: ");
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int[] res=new int[n];
//		for(int i=0;i<n;i++) {
//			while(!s1.isEmpty() && s1.peek()>=arr[i]) {
//				s1.pop();
//			}
//			if(s1.isEmpty()) {
//				res[i]=-1;
//			}
//			else {
//				res[i]=s1.peek();
//			}
//			s1.push(arr[i]);
//		}
//		System.out.print("previous smallest number in the given array: ");
//		for(int i=0;i<n;i++) {
//			System.out.print(res[i]+" ");
//		}
//		
//	}
//}