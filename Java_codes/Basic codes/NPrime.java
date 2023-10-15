// program to display the n prime numbers
import java.util.Scanner;
class NPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of prime number you want");
        int n=sc.nextInt();
        int num=2;
        while(n!=0 ){
            int flag=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(" "+num);
                n--;
            }
            num++;
        }
    }
}