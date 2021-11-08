
public class NestedLoopAppl {

	public static void main(String[] args) {
//		printStars(4, 5);
//		pithagoras();
		figure(8);
	}

	public static void figure(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void printStars(int rows, int cols) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pithagoras() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
