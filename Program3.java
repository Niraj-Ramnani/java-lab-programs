//Write a program to print factorial of the given number 
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is solved by name");
		System.out.print("enter any value ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=n; i++) {
			fact =  i * fact;
		}
		System.out.println("factorial of " + n + " is " + fact);

	}

}
