package nestedForLoop;

public class Pyramid {

	public static void main(String[] args) {

		int k = 1;

		for (int i = 0; i < 4; i++) {

			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println();
		}
	}
}
