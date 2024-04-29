//Write a java Program to print multiplication table using array 

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {
        System.out.println("This Program is solved by name roll no 114");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows for matrix one: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns for matrix one: ");
        int c1 = sc.nextInt();
        int[][] matrix_1 = new int[r1][c1];
        System.out.println("Enter values for matrix one: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix_1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter number of rows for matrix two: ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns for matrix two: ");
        int c2 = sc.nextInt();
        int[][] matrix_2 = new int[r2][c2];
        System.out.println("Enter values for matrix two: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix_2[i][j] = sc.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
            
        }
        int[][] res_matrix = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += matrix_1[i][k] * matrix_2[k][j];
                }
                res_matrix[i][j] = sum;
            }
        }
        

        System.out.println("Output of the product of the matrices is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res_matrix[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
