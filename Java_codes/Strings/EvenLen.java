//count the even lenght word in the string

import java.util.*;
class EvenLen{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();

        int c=0,start=0,end=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==' '){
                end=i;
            }
            int len=0;
            for(int j=start;j<end;j++){
                    len++;
                    start=end;
            }
            if(len>0 && len%2==0){
                c++;
            }
        }
        System.out.println(end+" "+start);
        if((end-1-start)%2==0){
            c++;
        }
        System.out.println(c);
        }
 }