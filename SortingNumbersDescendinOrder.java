package arrayLogics;
//int array = {2,3,5,1,6,8} print them in descending order Output must be 8 6 5 3 2 1
public class SortingNumbersDescendinOrder {
	public static void main(String[] args) {
		 int [] arr ={2,3,5,1,6,8};     
	        int temp = 0;                       
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        } 
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }   
	}
}
