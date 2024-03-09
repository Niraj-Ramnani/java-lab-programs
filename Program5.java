//program to print sum of the digits 
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This Problem is solved by Niraj Ramnani");
		System.out.print("Enter any digit ");
		int num,temp;
		int sum = 0;
		num = sc.nextInt();
	
		while(num!=0) {
			temp = num %10;
			sum = sum + temp;
			num = num/10;
		}
		System.out.println("Sum of the given digit is " + sum);

	}

}