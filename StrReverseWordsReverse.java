package arrayLogics;
//Input "I AM FROM BANGLORE" Output BANGLORE FROM AM I
public class StrReverseWordsReverse {
	public static void main(String[] args) {
		String sk=args[0];
		String[] sks=sk.split(" ");
		for(int i=sks.length-1;i>=0;i--) {
			System.out.print(sks[i]+" ");
		}
	}
}
