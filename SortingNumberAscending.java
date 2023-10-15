package arrayLogics;
//int array = {2,3,5,1,6,8} print them in Ascending order Output must be 1 2 3 5 6 8
public class SortingNumberAscending {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		 int b=Integer.parseInt(args[1]);
		 int c=Integer.parseInt(args[2]);
		 int d=Integer.parseInt(args[3]);
		 int e=Integer.parseInt(args[4]);
		 int f=Integer.parseInt(args[5]);
		  int[] sk= {a,b,c,d,e,f};
		int temp=0;
		for(int i=0;i<sk.length;i++) {
			for(int j=i+1;j<sk.length;j++) {
				if(sk[i]>sk[j]) {
					temp=sk[i];
					sk[i]=sk[j];
					sk[j]=temp;
				}
			}
		}
		for(int i=0;i<sk.length;i++) {
			System.out.print(sk[i]+" ");
		}
	}

}
