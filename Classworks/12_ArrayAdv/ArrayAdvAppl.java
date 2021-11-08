
public class ArrayAdvAppl {

	public static void main(String[] args) {
		int[] arr = new int[10];
		printArray(arr);
		fillArray(arr, 10, 99);
		printArray(arr);
		int sum = sumArray(arr);
		System.out.println("sum = " + sum);
		double avg = average(arr);
		System.out.println("average = " + avg);
		int res = max(arr);
		System.out.println("max = " + res);
		res = search(arr, arr[8]);
		System.out.println("index = " + res);
	}
	
	public static int indexOfMin(int[] arr) {
		//TODO
		return -1;
	}
	
	public static int min(int[] arr) {
		//TODO
		return -1;
	}
	
	public static int search(int[] arr, int value){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static int max(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > res) {
				res = arr[i];
			}
		}
		return res;
	}

	public static double average(int[] arr) {
		return 1. * sumArray(arr) / arr.length;
	}

	public static int sumArray(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += arr[i];// res = res + arr[i];
		}
		return res;
	}

	public static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max - min + 1));
		}

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
