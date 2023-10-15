package arrayLogics;
//How to find second largest element in array using for loop?
public class SecondLargestNumber {
	public static void main(String[] args) {
//	String[] ak=args[0].split(",");
//	int a=Integer.parseInt(ak[0]);
//	int b=Integer.parseInt(ak[1]);
//	int c=Integer.parseInt(ak[2]);
//	int d=Integer.parseInt(ak[3]);
//	int e=Integer.parseInt(ak[4]);
//	int[] sk= {a,b,c,d,e};
	//	int[] sk= {15,25,66,66,65,65,65,65,66,70,71,72,44};
		String a="maran";
		int rep=0;
		int nonRep=0;
		char[] sk=a.toCharArray();
	for(int i=0;i<sk.length;i++) {
		int c=0;
		for(int j=i+1;j<sk.length;j++) {
			if(sk[i]==sk[j]) {
				sk[j]='&';
				c++;
			}
		}
		if(c>0 && sk[i]!='&') {
			rep++;
		}
		else if(c==0 ) {
			nonRep++;
		}
	}
	System.out.println(rep);
	System.out.println(nonRep);
		
	
	
	}
}
