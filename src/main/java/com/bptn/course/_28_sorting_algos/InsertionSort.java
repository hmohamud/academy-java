package com.bptn.course._28_sorting_algos;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] arr) {
		int size = arr.length;
		// outer loop for each index
		for (int i = 0; i < size; i++) {
			int key = arr[i];

			int j = i - 1;
			// inner loop to compare and swap
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before Sort: " + Arrays.toString(data));
		insertionSort(data);
		System.out.println("After Sort: " + Arrays.toString(data));
	}
}
