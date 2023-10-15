// program to check the given num is prime or not
import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        int num=sc.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("yes the "+num+" is prime");
        }
        else{
            System.out.print("no the "+num+" is not a prime");
        }
        
    }
}