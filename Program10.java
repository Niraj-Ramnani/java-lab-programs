// write a java program to print the quadratic roots using command line arguments 
import java.util.Scanner;
public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This Program is solved bt Niraj Ramnani");
		double a,b,c;
		System.out.println("Enter value of a ");
		a = sc.nextDouble();
		System.out.println("Enter value of b ");
		b = sc.nextDouble();
		System.out.println("Enter value of c ");
		c = sc.nextDouble();
		
		double temp = b*b - 4*a*c;
		if(temp>0) {
			double root1 = (-b + Math.pow(temp,0.5))/(2.0*a);
			double root2 = (-b - Math.pow(temp,0.5))/(2.0*a);
			System.out.println("Roots are real and distinct ");
			System.out.println("root1 = " + root1);
			System.out.println("root2 = " + root2);
		}
		else if(temp ==0 ) {
			double root = -b/(2.0*a);
			System.out.println("quardratic root is " + root);
		}
		else {
			double real = -b/(2.0*a);
			double imaginary = Math.sqrt(-temp);
			System.out.println("Roots are imaginary and distinct ");
			System.out.println("root1 = " + real + "+" + imaginary + "i" );
			System.out.println("root1 = " + real + "-" + imaginary + "i" );
		}

	}

}
