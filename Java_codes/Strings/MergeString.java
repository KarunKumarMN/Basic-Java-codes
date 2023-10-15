import java.util.*;

class MergeString {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char a[] = sc.nextLine().toCharArray();
    char b[] = sc.nextLine().toCharArray();
    int x = sc.nextInt();

    int al = 0;
    int bl = 0;
    for (int i : a) {
      al++;
    }
    for (int j : b) {
      bl++;
    }
    

    int cl = al + bl;

    char c[] = new char[cl];
    for (int i = 0; i < x; i++) {
      c[i] = a[i];
    }

    int j = 0;
    for (int i = x; i < b.length + x; i++) {
      c[i] = b[j];
      j++;
    }

    int k = x;
    for (int i = x + bl; i < c.length; i++) {
      c[i] = a[k];
      k++;
    }
    System.out.println(c);
  }
}
