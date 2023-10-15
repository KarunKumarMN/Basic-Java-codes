import java.util.*;
class StrLen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int n=0;
       for(int i: a){
        n++;
       }
        System.out.println(n);
    }
}

// public class StringLengthWithoutLengthMethod {
//     public static void main(String[] args) {
//         // Input string
//         String inputString = "Hello, World!";
        
//         // Initialize a variable to store the length
//         int length = 0;
        
//         // Iterate through the string using a while loop
//         // Continue until an IndexOutOfBoundsException is caught
//         try {
//             while (true) {
//                 inputString.charAt(length);
//                 length++;
//             }
//         } catch (IndexOutOfBoundsException e) {
//             // IndexOutOfBoundsException indicates the end of the string
//         }
        
//         // Print the length of the string
//         System.out.println("Length of the string: " + length);
//     }
// }
