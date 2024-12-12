package array;

/*
 
 {1,3,7}
 {8,6,3}
 {0,5,9}
 
  */

public class MaxNumber {
	public static void main(String[] args) {

		int matrix[][] = { { 8, 3, 7 }, { 8, 6, 3 }, { 7, 5, 9 } };
		int minNumber = matrix[0][0];
		int minColumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] < minNumber) {
					minNumber = matrix[i][j];
					minColumn = j;
				}
			}
		}
		System.out.println("Minimum number is : " + minNumber);

		int maxNumber = matrix[0][minColumn];
		int k = 0;
		while (k < 3) {
			if (matrix[k][minColumn] > maxNumber) {
				maxNumber = matrix[k][minColumn];
			}
			k++;
		}

		System.out.println("Max number of min column value : " + maxNumber);

	}

}
