// write a java program to demonstrate user define exception 
package com.aryacollege;
import java.util.Scanner;

class DivisionException extends Exception {
    
    public String getMessage() {
        return "Cannot divide by zero";
    }
}

public class Program22 {
    public static double divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException();
        }
        return a / b;
    }

    public static void main(String[] args) {
    	System.out.println("This program is solved by niraj Ramnanin roll no 114");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();
            double result = divide(numerator, denominator);
            System.out.println("Division result: " + result);
        }  
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
