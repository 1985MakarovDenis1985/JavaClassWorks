
public class ArrayAdvAppl {

	public static void main(String[] args) {
		int[] arr = new int[10];
		printArray(arr);
		fillArray(arr);
		printArray(arr);
	}

	public static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * i;
		}

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
