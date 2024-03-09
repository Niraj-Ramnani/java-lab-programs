//write a java program to check given string is palidrome or not 

import java.util.Scanner;
public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("This program is solved by name");
	System.out.print("Enter any string ");
	String str = sc.next();
        String temp = " ";
    for(int i = str.length() -1; i>=0; i--){
        temp = temp + str.charAt(i);
    }
    if(str.equals(temp)){
        System.out.println("Given String is Palindrome");
    }
    else{
        
        System.out.println("Given String is not Palindrome");
    }

	}

}
