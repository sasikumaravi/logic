package arrayLogics;
import java.util.Arrays;
public class ArraySorting {
	public static void main(String[] args) {
		int[] sk= {25,35,56,89};
		String[] ak= {"m","b","c","d","e"};
		Arrays.sort(ak);   
		for(int i=0;i<ak.length;i++) {
			System.out.println(ak[i]);
		}
	 }
}
