package pF_Session2.assignment2;

import java.util.Scanner;
public class Assignment2 {

	/**
	 * Following function spaces(int row,int n) print spaces
	 * 
	 * @param row(int) denotes the row no. of pattern
	 * @param n (int) denotes the size of pattern
	 * @return s1(String) of spaces
	 */
		public String spaces(int row,int n)
		{
			String s1="";
			int i=1;
			int k=row;
			while(i<k)
			{
				s1+=" ";
				i++;
			}
			
			return s1;
		}
		/**
		 * Following function numbers(int row,int n) print numbers
		 * @param row (int) denotes the row no.
		 * @param n(int) denotes the size of pattern
		 * @return s1(String) returns a string
		 */
		public String numbers(int row,int n)
		{
			String s1="";
			int i=1;
			for(i=1 ; i<=n-row+1 ; i++)
			{
				s1+=i;
			}
			
			return s1;
		}
		

		/**
		 * following Function returns a complete pattern
		 * @param n(int) denotes the size of pattern
		 * @return returns String
		 */
		public String[] printpyramid(int n)
		{
			String [] pyr=new String[n];
			for(int i=1;i<=n;i++)
			{
				pyr[i-1]=spaces(i,n);
				pyr[i-1]=pyr[i-1]+numbers(i,n);
			}
			return pyr;
		}
		
		public static void main(String args[])
		{
			Assignment2 str=new Assignment2();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter no. of rows");
			int n=sc.nextInt();
			for(String str1:str.printpyramid(n)) {
				System.out.println(str1);
			}
			
			sc.close();
		}
		

	}



