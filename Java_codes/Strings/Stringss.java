import java.util.*;

class Stringss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[];
        System.out.println("enter the string");
        a=sc.nextLine().toCharArray();
        System.out.println(a);
        
        // System.out.println("before revesing the string is = " + a);
        //logic for reverse
        int i=0;
        int j=a.length-1;
        while(i<j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
        System.out.println(a);


        // System.out.println("After revesing the string is = "+ a);

       

    }
}