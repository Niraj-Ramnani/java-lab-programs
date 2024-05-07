
//

import calculation.*;
import java.util.Scanner;
public class Program19 {

	public static void main(String[] args) {
		System.out.println("This program is solved by niraj Ramnanin roll no 114");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the intiger value for side of cube ");
		int side1 = sc.nextInt();
		System.out.print("Enter the float value for side of cube ");
		float side2 = sc.nextFloat();
		System.out.print("Enter the double value for side of cube ");
		double side3 = sc.nextDouble();
		System.out.println("Cube for intiger number " + CubeCalculator.cube(side1));
		System.out.println("Cube for float number " + CubeCalculator.cube(side2));
		System.out.println("Cube fordouble number " + CubeCalculator.cube(side3));


	}

}
