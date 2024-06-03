

import java.io.*;

public class Program27 {

    public static void main(String[] args) {
        String fileName = "output.txt";
        System.out.println("This Program is solved by name  ");

        try {
           
            FileOutputStream fos = new FileOutputStream(fileName);
            String str = "This line is writter in output.txt using input and output streams ";
            fos.write(str.getBytes());
            fos.close();
            System.out.println("Data written to " + fileName);

       
            showFilePath(fileName);

         
            readFile(fileName);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void showFilePath(String fileName) {
        File file = new File(fileName);
        System.out.println("File is created at: " + file.getAbsolutePath());
    }

    public static void readFile(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            int character;
            while ((character = fis.read()) != -1) {
                System.out.print((char) character);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
