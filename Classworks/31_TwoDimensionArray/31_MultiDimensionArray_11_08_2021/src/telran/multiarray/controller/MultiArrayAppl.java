package telran.multiarray.controller;

public class MultiArrayAppl {

	public static void main(String[] args) {
		int[][] arr = new int[12][];
		arr[0] = new int[31];
		arr[1] = new int[28];
		arr[2] = new int[31];
		arr[3] = new int[30];
		printArray(arr);

	}

	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
