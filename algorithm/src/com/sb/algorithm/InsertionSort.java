package com.sb.algorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		insertionSort(Array.arr);
	}

	public static void insertionSort(int[] arr) {
		for (int index = 1; index < arr.length; index++) { // 1.
			int temp = arr[index];
			int prev = index - 1;
			while ((prev >= 0) && (arr[prev] > temp)) { // 2.
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp; // 3.
		}
		System.out.println(Arrays.toString(arr));
	}
}
