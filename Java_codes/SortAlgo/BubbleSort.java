import java.util.*;
class BubbleSort{
    public static void main(String args[])
    {
        int a[]={4,2,23,2322,1,2,23,9};
        int temp;
        for(int j=0;j<a.length;j++){
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}