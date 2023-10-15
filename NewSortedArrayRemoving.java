package arrayLogics;

public class NewSortedArrayRemoving {
	public static void main(String[] args) {
		int[] num = { 1, 1, 1, 2, 2, 3,6,4, 5, 5, 7, 7, 7, 7, 8, 8, 8, 80 };
		int[] ar = new int[200];
		ar[0] = num[0];
		int j = 1;
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] != num[i]) {
				ar[j] = num[i];
				j++;
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.println(ar[i]);
		}
		
	}
}
