//prog to print even and odd numbers upto the given numbers
import java.util.Scanner;
class EvenOdd{
    public static void main(String ksrun[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of (even/odd)number you want");
        int n=sc.nextInt();

        System.out.println("The first "+n+" even numbers are");
        int count=0,i=2;
        while(count!=n){
            if(i%2==0){
                System.out.print(" "+i);
            }
            i+=2;
            count++;
        }

        System.out.println();

        System.out.println("The first "+n+" odd numbers are");
        i=1;
        count=0;
        while(count!=n){
            if(i%2!=0){
                System.out.print(" "+i);
            }
            i+=2;
            count++;
        }

        // for(int i=1;i<=n;i++){
        //     if(i%2!=0){
        //         System.out.print(i+" ");
        //     }
        //     if(i%2==0){
        //         System.out.println(i);
        //     }

        // }
    }
}