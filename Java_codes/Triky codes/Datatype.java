import java.util.*;
import java.io.*;

class Datatype {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                // Check if the number can be stored in each primitive data type
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println(Byte.MIN_VALUE+"      "+Byte.MAX_VALUE);
                    System.out.println("* byte");
                }

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println(Short.MIN_VALUE+"      "+Short.MAX_VALUE);
                    System.out.println("* short");
                }

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println(Integer.MIN_VALUE+"      "+Integer.MAX_VALUE);
                    System.out.println("* int");
                }

                // Always true for long since it's the largest data type
                System.out.println(Long.MIN_VALUE+"      "+Long.MAX_VALUE);
                System.out.println("* long");
                
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
