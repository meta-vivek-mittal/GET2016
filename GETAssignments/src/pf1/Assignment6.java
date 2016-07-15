package Assignment6;

import java.util.Scanner;

public class Assignment6 {

	public static int[] join(int array1[], int asize, int array2[], int bsize,
			int mergedarray[]) {

		int lb1, lb2, k = 0;

		for (lb1 = 0, lb2 = 0; lb1 < asize && lb2 < bsize; k++) {
			if (array1[lb1] < array2[lb2])
				mergedarray[k] = array1[lb1++];
			else
				mergedarray[k] = array1[lb2++];
		}
		while (lb1 < asize) {
			mergedarray[k++] = array1[lb1++];
		}

		while (lb2 < bsize) {
			mergedarray[k++] = array2[lb2++];
		}

		return mergedarray;
	}

	public boolean check(int array1[], int array2[]) {
		boolean flag = true;
		int[] array3 = new int[array1.length + array2.length];

		array3 = join(array1, array1.length, array2, array2.length, array3);

		for (int j = 0; j < array3.length - 1; j++) {
			if (array3[j] > array3[j + 1]) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}
	/*
	 * public static void main(String args[]) { Scanner sc=new
	 * Scanner(System.in); System.out.println("How many Numbers : "); int
	 * i=sc.nextInt(); int array1[]=new int[i]; for(int j=0;j<i;j++) {
	 * 
	 * array1[j]=sc.nextInt(); } System.out.println("How many Numbers : "); int
	 * k=sc.nextInt(); int array2[]=new int[k]; for(int j=0;j<k;j++) {
	 * 
	 * array2[j]=sc.nextInt(); }
	 * 
	 * int mergedarray[]=new int[i+k];
	 * mergedarray=join(array1,i,array2,k,mergedarray);
	 * 
	 * for(int l=0;l<i+k;l++) { System.out.println(mergedarray[l]); }
	 * sc.close(); }
	 */
}
