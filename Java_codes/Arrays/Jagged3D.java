import java.util.*;
class Jagged3D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of school");
        int r=sc.nextInt();
        int a[][][]=new int[r][][];

        //to take input to 3d array
        for(int i=0;i<a.length;i++){
            System.out.println("enter the number of class in school "+(i+1));
            int c=sc.nextInt();
            a[i]=new int[c][];
            for(int j=0;j<a[i].length;j++){
                System.out.println("enter the number of student in class "+(j+1));
                int s=sc.nextInt();
                a[i][j]=new int[s];
                System.out.println("enter the marks of students ");
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=sc.nextInt();
                }
            }

        }


// to print the 3d array
        System.out.println("\n\n");
         for(int i=0;i<a.length;i++){
            System.out.println("the deatail of school"+(i+1));
            for(int j=0;j<a[i].length;j++){
               
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+ "  ");
                }
                System.out.println("");
            }
        }


    }
}