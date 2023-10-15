package arrayLogics;

public class MergeArrays {
 public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	int[] b= {10,20,35,45,56};
	int c=a.length+b.length;
	
	int[] ab=new int[c];
//	ab[0]=10;
//	ab[1]=20;
//	ab[2]=30;
//	ab[3]=40;
//	ab[4]=190;
//	ab[5]=56;
//	ab[6]=23;
//	ab[7]=79;
//	ab[8]=16;
//	ab[9]=177;
//	ab[10]=1167;
	
	for(int m=0;m<a.length;m++) {
		ab[m]=a[m];
	}
	for(int n=0;n<b.length;n++) {
		ab[n+a.length]=b[n];	
	}
	for(int i=0;i<ab.length;i++) {
		System.out.println(ab[i]);
	}
}
}
