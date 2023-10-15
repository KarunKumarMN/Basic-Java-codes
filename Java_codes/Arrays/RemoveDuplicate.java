import java.util.*;
class RemoveDuplicate{
    static int[] method1(int[] a){
        int count=0;
        int i=0;
        while(i<a.length-1){
            int key=a[i];
            while(a[i]==key){
                count++;
                i++;
            }
            count =count-1;
        }
        System.out.println(count);
        int dup[]=new int[a.length-count-1];
        int k=0;
        for(i=0;i<a.length;i++){
            int key=a[i];
            int j;
            int flag=1;
            for( j=0;j<dup.length;j++){
                if(dup[j]==key){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                dup[k]=key;
                k++;
            }
        }
        
        return dup;
    }
    public static void main(String[] karun){
        int a[]={1,1,1,2,2,3,3,8,9,9,9,88,88,909,4545,32,34,11,3,34,44,44,44,44,55,66,44,9,9099,3,3,4,5};
        Arrays.sort(a);
         a=method1(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}