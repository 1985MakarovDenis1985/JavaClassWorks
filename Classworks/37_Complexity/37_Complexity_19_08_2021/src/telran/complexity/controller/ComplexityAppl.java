package telran.complexity.controller;

import java.util.Arrays;

public class ComplexityAppl {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19 };

		// O(1)
		double mid = (arr[0] + arr[arr.length - 1]) / 2.;

		// O(n)
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		// O(log(n))
		int index = Arrays.binarySearch(arr, 18);

		// O(n^2)
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		
		//O(n * log(n))
		Arrays.sort(arr);

	}

}
