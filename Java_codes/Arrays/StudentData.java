import java.util.*;

class StudentData{
    public static void main(String dfd[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the mark");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
                System.out.println("Marks of student "+(i+1)+" is " + a[i]);
                        }
        for(int i=0;i<dfd.length;i++){
            System.out.println(dfd[i]);
        }

    }
}