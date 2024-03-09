//write a java  Program to print prime number upto given prime number 
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		System.out.println("This Problem is solved by Niraj Ramnani");
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter any number ");
		num = sc.nextInt();
		System.out.println("all the prime numbers till "+num);
		for(int i = 2; i<=num; i++) {
			int k = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j==0) {
					k++;
				}
			}
			if(k==2) {
				System.out.println(i);
			}
			
		}

	}

}
