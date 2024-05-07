// write a java program to list multiple inheritance using interface 

interface derived_1{
	void func_1();
}
interface derived_2{
	void func_2();
}
class parent implements derived_1,derived_2{
	public void func_1() {
		System.out.println("this is the function of the first interface ");
	}
	public void func_2() {
		System.out.println("this is the function of the second interface ");

	}
}
public class Program20 {

	public static void main(String[] args) {
		System.out.println("This Program is solved by name  roll no   ");
		parent obj = new parent();
		obj.func_1();
		obj.func_2();

	}

}
