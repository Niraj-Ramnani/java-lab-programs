//Write a java program for swaping two number 
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is solved by name");
		System.out.print("Enter value of a ");
		a = sc.nextInt();
		System.out.print("Enter value of b ");
		b = sc.nextInt();
		System.out.println("Value of a and b before swapping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a and b after swapping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}