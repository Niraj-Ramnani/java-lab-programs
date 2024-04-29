// write a java program to demonstrate dynamic method overidding 
class Base{
	public void func () {
		System.out.println("The function of the base class is called ");
	}
}
class Derived_1 extends Base {
	public void func () {
		System.out.println("Overidden function of first derived class is called ");
	}
}
class Derived_2 extends Base{
	public void func () {
		System.out.println("Overidden function of second derived class is called ");
		}
}
public class Program17 {

	public static void main(String[] args) {
		System.out.println("This Program is solved by name    roll no   ");
		
		Base obj1 = new Derived_1();
		Base obj2 = new Derived_2();
		obj1.func();
		obj2.func();
		
	}

}
