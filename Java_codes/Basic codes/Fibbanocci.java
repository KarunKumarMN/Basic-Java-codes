import java.util.Scanner;
class Fibbanocci{
    public static void main(String args[])
    //array method
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        int[] a=new int[n];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");      
          }
        
          }

    //general method

    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int first=0;
    //     int sec=1;
    //     int third;
    //     System.out.print(first+" "+sec+" ");
    //     while(n>=2){
    //         System.out.print(first+sec+" ");
    //         third=first+sec;
    //         first=sec;
    //         sec=third;
    //         n--;

    //     }
        
    // }
}