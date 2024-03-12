//Write a java program to print names in sorted order 

import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This Program is solved by name");
		System.out.println("Enter Total number of names ");
		int num = sc.nextInt();
		
		String[] names = new String[num];
		for(int i =0; i<num; i++) {
		System.out.println("enter name" + i+1);	
			names[i] = sc.next();
		}
		String temp;
		 for(int i = 0; i<num; i++) {
			 for(int j = i+1; j<num; j++) {
				 if (names[i].compareTo(names[j]) > 0) {
					 temp = names[i];
					 names[i] = names[j];
					 names[j] = temp;
				 }
			 }
		 }
		 System.out.println("Names after sorting are as folowing ");
		 for(int i =0; i<num; i++) {
			 System.out.println(names[i]);
		 }

	}

}
