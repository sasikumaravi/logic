package arrayLogics;

public class Task {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5,5,6,6};
		int cou=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					cou++;
				}
			}
			if(cou==0) {
				//System.out.println(a[i]);
				c++;
			}
		}
		System.out.println(c);
	}
}
