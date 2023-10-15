import java.util.*;
class StudentData2DR{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of class");
        int n=sc.nextInt();
        System.out.println("no of studetns in each cls");
        int m=sc.nextInt();
        int[][] a=new int[n][m];

        for(int i=0;i<a.length;i++){
            System.out.println("enter the marks of student of class "+ (i+1));
            for(int j=0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
            }
        }

          for(int i=0;i<a.length;i++){
            System.out.println("details of student of class "+ (i+1));
            for(int j=0;j<a[i].length;j++){
                System.out.println("student "+ (j+1)+"marks= "+ a[i][j]);
            }
        }
        
    }
}