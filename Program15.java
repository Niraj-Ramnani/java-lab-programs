// Write a java Program to show multilevel inheritance 
package com.aryacollege;
class A {
	void func_A() {
		System.out.println("Function of class A is called ");
	}
}
class B extends A {
	void func_B() {
		System.out.println("Function of class B is called ");
	}
}

class C extends B{
	void func_C() {
		System.out.println("Function of class C is called ");
	}
}
public class Program15 {

	public static void main(String[] args) {
        System.out.println("This Program is solved by name ");
		C obj = new C();
		obj.func_A();
		obj.func_B();
		obj.func_C();

	}

}
