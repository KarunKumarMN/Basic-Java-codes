import java.util.Scanner;
class EvenOdd{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("enter the n elements of the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }


        System.out.println("EVEN NUMBERS");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("\n");
        System.out.println("ODD NUMBERS");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}