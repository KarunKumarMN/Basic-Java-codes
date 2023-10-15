import java.util.*;
class Jagged2D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of class room");
        int r=sc.nextInt();
        int a[][]=new int[r][];


        for(int i=0;i<a.length;i++){
            System.out.println("enter the marks of student in class "+(i+1));
            int cls=sc.nextInt();
            a[i]=new int[cls] ;
            for(int j=0;j<a[i].length;j++){
                    a[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

    }
}