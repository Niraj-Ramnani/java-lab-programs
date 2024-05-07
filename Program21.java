package com.aryacollege;
import java.util.Scanner; 

class parent_1 {
    final float pi = 3.14f;
    int radius;

    parent_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextInt();
    }

    float calculate_area(int r) {
        return pi * r * r;
    }
}

class child extends parent_1 {
   static float area;

    child() {
        super(); 
        area = super.calculate_area(radius); 
    }

    static void display_area() {
        System.out.print("Area of the circle is : " + area);
    }
}

public class Program21 {
    public static void main(String[] args) {
    	System.out.println("This Program is solved by name  roll no  ");
        child obj = new child();
        child.display_area();
        
    }
}
