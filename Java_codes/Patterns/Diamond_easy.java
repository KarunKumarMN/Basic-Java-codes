//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
public class  Diamond_easy{
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the diamond

        for (int i = 1; i <= n * 2 - 1; i++) {
            int spaces = Math.abs(n - i);
            int stars = n - spaces;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
