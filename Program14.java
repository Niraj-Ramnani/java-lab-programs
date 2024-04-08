// write a java Program to copy the value of one object integer to another using constructor  
import java.util.Scanner;
class demo{
	int num;
	Scanner sc = new Scanner(System.in);
	void set_value() {
		System.out.print("Enter value for object 1 ");
		 num = sc.nextInt();
	}
	public demo() { }
	public demo( demo obj) {
		num = obj.num;
	}
	int get_value() {
		return num;
	}
}
public class Program14 {
 
	public static void main(String[] args) {
        System.out.println("This Program is solved by name ");
		 demo obj1 = new demo();
		obj1.set_value();
		System.out.println("Value of integer for object 1 :"+obj1.get_value());
		demo obj2 = new demo(obj1);
		System.out.println("Value of integer for object 2 :"+obj2.get_value());
		
	}

}
