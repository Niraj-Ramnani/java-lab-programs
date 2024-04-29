// write a java program to implement vehicle  abstract class 
package com.aryacollege;
 abstract class Vehicle {
	public int fuel_consumed;
	public int distance;
	public float mileage ;
	abstract void Vehicle_mileage();
}
class Car extends Vehicle {
	public void Vehicle_mileage () {
		fuel_consumed = 5;
		mileage = distance/fuel_consumed;
		System.out.println("Mileage of the car is " + mileage + " kmpl");
		
	}
}
class Bike extends Vehicle {
public void Vehicle_mileage () {
	fuel_consumed = 3;
	mileage = distance/fuel_consumed;
	System.out.println("Mileage of the bike is " + mileage + " kmpl");

	} 
}
public class Program18 {

	public static void main(String[] args) { 
		System.out.println("This Program is solved by Niraj Ramnani");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the distance travelled by the car ");
		Car obj1 = new Car ();
		obj1.distance = sc.nextInt();
		obj1.Vehicle_mileage();
		Bike obj2 = new Bike();
		System.out.print("Enter the distance travelled by the bike ");
		obj2.distance = sc.nextInt();
		obj2.Vehicle_mileage();
	}

}
