import java.util.Arrays;

public class MyInsertionSort {
	public static void main(String[] args) {
		insertionSort(Array.arr);
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int prev = i - 1;
			while((prev >= 0) && (arr[prev] > temp)) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
