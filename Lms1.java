package arrayLogics;
//How to get sum of elements in an array using for loop?
public class Lms1 {
	public static void main(String[] args) {
		int[] a= {4,5,5,4,3,4,4,8,6,6,6};
		//int count=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				count++;
					
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
		//System.out.println(count);

	}
	
}
