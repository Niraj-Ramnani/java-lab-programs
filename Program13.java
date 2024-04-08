//write a java program to find volume of the box using method overloading with different number of parameters 
import java.util.Scanner;
public class Program13 {
	static void volume(int a ) {
		System.out.println("Volume of the cube is "+ a*a*a);
	}
	static void volume(int l,int b, int h) {
		System.out.println("Volume of the cuboid is "+l*b*h);
	}

	public static void main(String[] args) {
        System.out.println("This Program is solved by name ");
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose the type of the box ");
		System.out.print("1 for cube \n2 for cuboid ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: System.out.print("Enter the side of the cube ");
		int s = sc.nextInt();
		volume(s);
		break;
		case 2 : System.out.println("Enter the edges of the cuboid");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int height = sc.nextInt();
		volume(length,breadth,height);
		}
	
	}

}
