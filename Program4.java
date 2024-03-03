import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the range ");
		int range = sc.nextInt();
		for(int i = 1 ; i<=range; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}