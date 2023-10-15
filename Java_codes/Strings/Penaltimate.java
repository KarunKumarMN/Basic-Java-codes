import java.util.*;
class Penaltimate{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int start=0;
        int end=0;

        for(int i=a.length-1;i>=0;i--){
                            int f=0;

            if(a[i]==' '){
                end=i-1;
                for(int j=i-1;j>=0;j--){
                    if(a[j]==' ' || j==0){
                        if(j==0){
                            start=j;
                        }
                        else{
                        start=j+1;
                        f=1;
                        break;}
                    }
                }
                
            }
            if(f==1){
                    break;
                }
        }
   
        for(int i=start;i<=end;i++){
            System.out.print(a[i]);
        }
        }
 }