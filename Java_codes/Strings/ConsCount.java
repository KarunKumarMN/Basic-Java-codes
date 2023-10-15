import java.util.*;

//pro to count the consonents in string
class ConsCount {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char a[] = sc.nextLine().toCharArray();
    char b[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    int c = 0;
    for (int i : a) {
      int k = 0;
      for (int j : b) {
        if (j == i) {
          k++;
          break;
        }
      }
      if (k == 0) {
        c++;
      }
    }
    System.out.println(c);
    System.out.println(a.length - c);
  }
}
//  char a[]=sc.nextLine().toCharArray();
//         char b[]={'a','e','i','o','u','A','E','I','O','U'};
//         int c=0;
//         for( int i : a){
//             for(int j:b){
//                 if((i!=j)){
//                     c++;
//                 }
//             }
//         }
