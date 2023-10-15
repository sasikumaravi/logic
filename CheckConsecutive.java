package arrayLogics;
//If three consecutive even number are present in array print true else print false
public class CheckConsecutive {
	public static void main(String[] args) {
		int [] num= {1,2,2,2,3,4};
		//boolean flag=false;
		int r=0;
		int a=0;
		for(int i=0;i<num.length;i++) {
			r=num[i]+num[i+1]+num[i+2];
			if(r%2==0) {
				r=0;
				a=1;
			}
			else {
				a=0;
			}
		}
		if(a==0) {
			System.out.println("Note even");
		}
		else {
			System.out.println("Even");
		}
	}

}
