package arrayLogics;
//Find the repeated value in the array Example int [] a ={1,2,2,3,4,5}
public class FindRepeatedValue {
	public static void main(String[] args) {
		 int a=Integer.parseInt(args[0]);
		 int b=Integer.parseInt(args[1]);
		 int c=Integer.parseInt(args[2]);
		 int d=Integer.parseInt(args[3]);
		 int e=Integer.parseInt(args[4]);
		 int f=Integer.parseInt(args[5]);
		int[] sk= {a,b,c,d,e,f};
		//int skr= 0;
		for(int i=0;i<sk.length;i++) {
			for(int j=i+1;j<sk.length;j++) {
				if(sk[i]==sk[j]) {
					System.out.println(sk[i]);
				}
			}
		}
		//System.out.println(skr);
	}

}
