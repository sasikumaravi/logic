package arrayLogics;

public class UnSortedArray {
	public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5, 5, 3, 2, 1};
        int size = array.length;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            if (array[i] != -1) {
                int currentElement = array[i];
                System.out.print(currentElement + " ");

                for (int j = i + 1; j < size; j++) {
                    if (array[j] == currentElement) {
                        array[j] = -1;
                        isDuplicate = true;
                    }
                }

                if (isDuplicate) {
                    array[i] = -1;
                }
            }
        }
    }
}
