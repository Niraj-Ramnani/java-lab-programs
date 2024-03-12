//Write a java Program to print multiplication table using array 

import java.util.Scanner;
public class Program12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("This Program is solved by name ");
	System.out.println("Enter total number of multiplication tables you want to print ");
	int num = sc.nextInt();
	int table[][] = new int[10][num];
	for(int i =0; i<10; i++) {
		for(int j = 0; j<num; j++) {
			table[i][j] = (i+1)*(j+1);
		}
	}
	System.out.println("Multiplication tables till given number " + num);
	for(int i =0; i<10; i++) {
		for(int j = 0; j<num; j++) {
			System.out.printf("%4d", table[i][j]);
		}
		System.out.println();
	}
	}

}
