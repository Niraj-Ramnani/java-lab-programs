import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three distinct number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
		
			System.out.print(a + " is gretaest");
		}
		else if(b>a && b>c) {
		
			System.out.print(b + " is gretaest");
		}
		else {
			
			System.out.print(c + " is gretaest");
		}

	}

}