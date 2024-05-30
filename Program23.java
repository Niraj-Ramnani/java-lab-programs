// java program to demonstrate exception handelling with multiple catch block  
package com.aryacollege;
import java.util.Scanner;
public class Program23 {

	public static void main(String[] args) {
		System.out.println("This program is solved by Niraj Ramnani roll no 114");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the elements of the array ");
		for(int i =0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		try {
		System.out.print("enter the index of array element you want to fetch : ");
		int index = sc.nextInt();
		System.out.println("Element at " + index + " index is " + arr[index]);
		System.out.print("Enter the value of divisor : ");
		int divisor = sc.nextInt();
		int division = arr[index]/divisor;
		System.out.print("Result of the division is " + division);
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("Array only has range of 5 elements ");
		}
		catch (ArithmeticException e ) {
			System.out.println("Can not divide a number with zero ");
		}
		catch (Exception e ) {
			System.out.print("An uncertain error occured ");
		}
	}

}
