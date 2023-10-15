//missing number in the natural number 

import java.util.*;


class MissingNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum+=i;
        // }
        int sum=(n*(n+1))/2;
        int sub=0;
         for(int i=0;i<a.length;i++){
            sub+=a[i];
        }
        System.out.println("missing num is "+(sum-sub));
        
    }
}