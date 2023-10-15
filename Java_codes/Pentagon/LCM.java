import java.util.*;
class LCM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=Math.max(a,b);
        int l=Math.min(a,b);

// method 1

        // int i=g;
        // while(i%l!=0){
        //     i+=g;
        // }
        // System.out.println(i);

//method 2

        // int i;
        int hcf=1;
        for(i=1;i<=b;i++){
            if(a%i==0 && b%i==0){
                 hcf=i;
            
            }
        }
        int lcm=(a*b)/hcf;
        System.out.println("HCF="+hcf);
        System.out.println("LCM="+lcm);



    }
}