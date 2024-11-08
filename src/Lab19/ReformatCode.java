package Lab19;

import java.util.Scanner;

public class ReformatCode {
    public static void main(String[] args) {
        String filename = args[0];
        java.io.File file = new java.io.File(filename);
        java.util.ArrayList<String> lines = new java.util.ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                lines.add(input.nextLine());
            }
            input.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        try {
            if (!file.exists()) throw new java.io.FileNotFoundException();
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            for (int i=0;i<lines.size()-1;i++) {
                if (lines.get(i+1).equals("{")) output.print(lines.get(i));
                else output.println(lines.get(i));
            }
            output.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    } 
}
