import java.util.*;
class Weight{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        char a[]=sc.nextLine().toCharArray();
        int s=0;
        for(int i:a){
            int k;
            if(i>96 && i<123){
                k=i-96;
                s+=k;

            }
             if(i>64 && i<91){

                k=i-64;
                s+=k;

            }
             if(i>47 && i<58){
                k=i-47;
                s+=k;

            }
            
        }
        System.out.println(s);
        
        }
 }