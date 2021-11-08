package telran.arrays.controller;

import telran.arrays.tools.ArrayTools;

public class ArrayToolsAppl {

	public static void main(String[] args) {
		int[] arr = new int[10];
		ArrayTools.fillArray(arr, 10, 99);
		ArrayTools.printArray(arr);
		ArrayTools.bubbleSort1(arr);
		ArrayTools.printArray(arr);
		int index = ArrayTools.binarySearch(arr, 800);
		System.out.println("index = " + index);
	}

	

}
