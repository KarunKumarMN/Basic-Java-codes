// Program to print sum and product upto the given number

import java.util.Scanner;
class NSumProd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number upto you want sum and product");
        int num=sc.nextInt(),sum=0,prod=1;
        for(int i=1;i<=num;i++){
            sum+=i;
            prod*=i;
        }        
        System.out.println("The sum is "+sum );
        System.out.println("The product is "+prod );

    }
}