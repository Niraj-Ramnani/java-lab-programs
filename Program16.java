// write a java program for bank class using method overridding 
package com.aryacollege;
class Bank {
	int principal,rate,time;
	float si;
	public void intrest() {
		si = (principal * rate * time)/100;
		System.out.println("intrest rate is " + si);
	}
}
class StateBank  extends Bank{
	public void intrest() {
		si = (principal * 4 * time)/100;
		System.out.println("intrest rate is " + si);
	}
}
class CentralBank  extends Bank{
	public void intrest() {
		si = (principal * 6 * time)/100;
		System.out.println("intrest rate is " + si);
	}
}
public class Program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This Program is solved by name   roll no    ");
		CentralBank obj = new CentralBank();
		System.out.print("enter value of principal ");
		obj.principal = sc.nextInt();
		System.out.print("enter value of time ");
		obj.time = sc.nextInt();
		obj.intrest();

	}

}
