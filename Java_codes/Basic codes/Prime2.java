import java.util.*;
class Prime2{
    public static void main(String Ar[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,count=0;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count!=2){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}