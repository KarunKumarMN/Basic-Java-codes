import java.util.Scanner;

public class Test {
    

    public static void main(String[] args) {
        
        int a[]={40,3,0,40,1,4};
        int max=40;
        int min=0;
        // int key=max;
        for(int i=0;i<a.length;i++){

            if(a[i]>min && a[i]!=max ){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}