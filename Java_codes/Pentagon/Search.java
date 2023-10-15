import java.util.*;
class Search{
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        int[] a=new int[n];
System.out.println("enteh the elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the key");
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(key==a[i])
            {
                count++;
            }       
        }
        System.out.println(count);

    }
}