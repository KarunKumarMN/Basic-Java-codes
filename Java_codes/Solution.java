import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 1; // Initialize line count

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineCount + " " + line);
            lineCount++;
        }
        scanner.close();
    }
}