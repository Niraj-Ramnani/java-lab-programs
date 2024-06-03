// write a java program to demonstrate file output stream and print stream classes 

import java.io.*;

public class Program26 {

    public static void main(String[] args) {
    	 System.out.println("This Program is solved by name  ");
        String fileName = "output.txt";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            PrintStream ps = new PrintStream(fos);
            ps.println("This is a line of text.");
            ps.println("Delhi");
            ps.println("Mumbai");
            ps.close();
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
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
