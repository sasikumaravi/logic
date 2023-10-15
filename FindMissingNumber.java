package arrayLogics;
import java.util.Scanner;
//int arr = {1,2,3,4,5,6,7,8,9} find the missing number using scanner and for loop
public class FindMissingNumber {
 public static void main(String[] args) {  
//	 Scanner sc=new Scanner(System.in);  
//	 System.out.print("Enter the number of elements you want to store: ");  
//	 //reading the number of elements from the that we want to enter  
//	 int n=sc.nextInt(); 
//	 int r=0;
//	 //creates an array in the memory of length 10  
//	 int[] array = new int[10];  
//	 System.out.println("Enter the elements of the array: ");  
//	 for(int i=0; i<n; i++)  
//	 {  
//	 //reading array elements from the user   
//	 array[i]=sc.nextInt();  
//	 }  
	 int a=Integer.parseInt(args[0]);
	 int b=Integer.parseInt(args[1]);
	 int c=Integer.parseInt(args[2]);
	 int d=Integer.parseInt(args[3]);
	 int e=Integer.parseInt(args[4]);
	 int f=Integer.parseInt(args[5]);
	 int[] array= {a,b,c,d,e,f};
	 int r=0;
	 for (int i=0; i<array.length; i++)   
	 {  
		 r=array[i]+1;
		if(array[i+1]==r) {
			r=0;
		}
		else {
			System.out.println(r);
		}
		
		 
	 }  
}
}
