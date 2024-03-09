//write a java program to print first 10 number in fibonaci series 
public class Program2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 ;
		System.out.println("This program is solved by name");
		System.out.println("to print first 10 fibonacci series digits");
		for(int i = 1; i<=10; i++) {
			System.out.println(num1);
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
		}
	}

}
