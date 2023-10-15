import java.util.*;

class RemSpecial {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char a[] = sc.nextLine().toCharArray();

    int lb = 0;

    for (char i : a) {
      if ((i > 47 && i < 58) || (i > 64 && i < 91) || (i > 96 && i < 123)) {
        lb++;
      }
    }

    char b[] = new char[lb];
    int j = 0;
    for (int i : a) {
      if ((i > 47 && i < 58) || (i > 64 && i < 91) || (i > 96 && i < 123)) {
        b[j] = (char) i;
        j++;
      }
    }
    System.out.println(b);
  }
}
