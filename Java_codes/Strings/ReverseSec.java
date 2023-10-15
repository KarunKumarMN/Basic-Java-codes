import java.util.*;

class ReverseSec{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int c=0;


        for(int sp:a){
            if(sp==' '){
                c++;
            }
        }
        if(c==0){
            System.out.println("no second word present");
        }


        int start=0;
        for(int i:a){
             start++;
            if(i==' '){
                break;
            }
        }

        int end=start;
        for(int i=start;i<a.length;i++){
            
            if(a[i]==' '){
                break;
            }
            end++;
        }
        end-=1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=(char)temp;
            start++;
            end--;
        }
        System.out.println(a);
    }
}