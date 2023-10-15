import java.util.Scanner;

public class SecondLarge {
    

    public static void main(String[] args) {
        
        int a[]={40,3000,0,400000,1,4};
    
    //find the max
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];

            }
        }
    //find the min
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];

            }
        }

    //to find the second largest element
        for(int i=0;i<a.length;i++){

            if(a[i]>min && a[i]!=max ){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}