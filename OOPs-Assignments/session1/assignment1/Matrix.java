package session1.assignment1;

import java.util.Scanner;

public class Matrix {

	private int array2D[][];
	private int row;
	private int col;

	/**
	 * following is a constructor that instantiate the object.
	 * @param row(int) denotes the no. of rows
	 * @param col(int) denotes the no. of columns.
	 */
	Matrix(int row, int col) {
		array2D = new int[row][col];
		this.row = row;
		this.col = col;
	}

	/**
	 * Following function add elements in an array.
	 * @param array2D(int [][]) denotes a 2-D array
	 * @return returns a 2-D array which has elements entered by the user.
	 */
	public int[][] addElements(int array2D[][]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Element (" + (i + 1) + "," + (j + 1)
						+ ") : ");
				this.array2D[i][j] = sc.nextInt();
			}
		}
		return array2D;
	}

	/**
	 * array2D(int [][]) denotes the array which is to be transposed.
	 * @return returns a transposed array.
	 */
	public int[][] transpose(int array2D[][]) {
		int transposeMatrix[][] = new int[array2D[0].length][array2D.length];
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[0].length; j++) {
				transposeMatrix[j][i] = array2D[i][j];
			}
		}
		int temp = array2D[0].length;
		this.row = array2D.length;
		this.col = temp;
		this.array2D = transposeMatrix;
		return this.array2D;
	}
	/**
	 * Following function prints the whole array 
	 * @return returns the array.
	 */
	public int[][] show() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("\t" + array2D[i][j]);
			}
			System.out.println("\n");
		}
		return this.array2D;
	}
	/** 
	 * @param array2D1
	 *(int [][]) denotes the first array.
	 * @param array2D2(int [][]) denotes the second array
	 * @param row1(int) denotes the rows of 1st array
	 * @param col1(int) denotes the columns of 1st array
	 * @param row2(int)denotes the rows of 2nd array
	 * @param col2(int) denotes the columns of 2nd array
	 * @return returns a 2D array which is a multiplication of first and second array
	 */
	public int[][] multiplication(int array2D1[][], int array2D2[][], int row1,
			int col1, int row2, int col2) {
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.col; j++) {
				array2D[i][j] = 0;
				for (int k = 0; k < row2; k++) {
					array2D[i][j] += array2D1[i][k] * array2D2[k][j];
				}
			}
		}
		return array2D;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns : ");
		int col = sc.nextInt();
		// object formation of class Matrix
		Matrix transposeMatrix = new Matrix(row, col);
		int array2D[][] = new int[transposeMatrix.row][transposeMatrix.col];
		// calling addElements function
		array2D = transposeMatrix.addElements(array2D);
		System.out.println("Before Transpose : \n");
		array2D = transposeMatrix.show();
		int temp[][] = new int[transposeMatrix.row][transposeMatrix.col];
		temp = transposeMatrix.transpose(array2D);
		System.out.println("\n\nAfter Transpose : ");
		temp = transposeMatrix.show();

		// Multiplication Logic
		System.out.println("Enter number of rows for 1st Matrix : ");
		int row1 = sc.nextInt();
		System.out.println("Enter number of columns for 1st Matrix : ");
		int col1 = sc.nextInt();
		System.out.println("Enter number of rows for 2nd Matrix : ");
		int row2 = sc.nextInt();
		System.out.println("Enter number of columns for 2nd Matrix : ");
		int col2 = sc.nextInt();

		if (col1 != row2) {
			System.out
					.println("Invalid Dimensions. Multiplication Not Possible.");
			System.exit(1);
		}

		Matrix multiplyMatrix = new Matrix(row1, col2);
		int array2D1[][] = new int[row1][col1];
		// input of 1st array
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.println("Enter Element (" + (i + 1) + "," + (j + 1)
						+ ") : ");
				array2D1[i][j] = sc.nextInt();
			}
		}
		int array2D2[][] = new int[row2][col2];
		// input of 2nd array
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.println("Enter Element (" + (i + 1) + "," + (j + 1)
						+ ") : ");
				array2D2[i][j] = sc.nextInt();
			}
		}

		int temp1[][] = new int[row1][col2];

		temp1 = multiplyMatrix.multiplication(array2D1, array2D2, row1, row2,
				col1, col2);
		temp1 = multiplyMatrix.show();
		sc.close();
	}
}
