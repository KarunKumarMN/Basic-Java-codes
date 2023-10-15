//write a java prog which accepts 1 char as input if it is a small char print it as capital else wise versa
import java.util.*;

class CharConv {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char a = sc.next().charAt(0);
    if (a > 64 && a < 91) {
      System.out.println((char) (a + 32));
    }
    if (a > 96 && a < 123) {
      System.out.println((char) (a - 32));
    }
  }
}
