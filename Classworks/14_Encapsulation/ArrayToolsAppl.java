
public class ArrayToolsAppl {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr, 10, 99);
		printArray(arr);
		bubbleSort1(arr);
		printArray(arr);
		int index = binarySearch(arr, 800);
		System.out.println("index = " + index);
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = indexMinInRange(arr, i + 1);
			if (arr[i] > arr[index]) {
				int t = arr[i];
				arr[i] = arr[index];
				arr[index] = t;
			}
		}

	}

	public static int indexMinInRange(int[] arr, int start) {
		int index = start;
		for (int i = start + 1; i < arr.length; i++) {
			if (arr[index] > arr[i]) {
				index = i;
			}
		}
		return index;
	}

	public static int binarySearch(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;
		int mid = (l + r) / 2;
		while (l <= r) {
			
			if (arr[mid] == value) {
				return mid;
			}
			if (arr[mid] < value) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
			mid = (l + r) / 2;
		}
		return -l - 1;
	}

	public static void bubbleSort1(int[] arr) {
		while (bubbling(arr));
	}

	public static boolean bubbling(int[] arr) {
		boolean flag = false;
		for (int j = 0; j < arr.length - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				arr[j] = arr[j] + arr[j + 1];
				arr[j + 1] = arr[j] - arr[j + 1];
				arr[j] = arr[j] - arr[j + 1];
				flag = true;
			}
		}
		return flag;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
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
