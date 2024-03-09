// write a java program to print sum of n terms in series 1/1!  + 1/2!  + 1/3! + -----
import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("This program is solved by name");
		System.out.println("enter any value");
		int num = sc.nextInt();
		float ans = 0 ;
		for(int i = 1; i<=num; i++){
           float temp = 1;
            for(int j =1; j<=i; j++ ){
                temp = temp * j;
            }
            ans =  ans + (1/temp);
        }
		System.out.println("given solution is " + ans);
		

	}

}
