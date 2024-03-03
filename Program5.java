//Write a java program to print sum of the digits 
import java.util.Scanner;
public class Program5{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first digit ");
		int num1 = sc.nextInt();
		System.out.print("Enter second digit ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of the two digits is " + sum);
		

	}

}