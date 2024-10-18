package com.bptn.course._28_sorting_algos;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {

		int size = array.length;

		// loop for every array element
		for (int i = 0; i < size; i++) {
			// another loop for comparison
			for (int j = 0; j < size - 1; j++) {
				// do the comparison
				if (array[j] > array[j + 1]) {
					// if value on right less than value on left, swap
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before Sort: " + Arrays.toString(data));
		bubbleSort(data);
		System.out.println("After Sort: " + Arrays.toString(data));

	}

}
