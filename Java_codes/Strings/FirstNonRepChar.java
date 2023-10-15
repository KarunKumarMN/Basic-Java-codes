import java.util.*;
class FirstNonRepChar{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        char a[]=sc.nextLine().toCharArray();

        int c=0;
        for(int i:a){
            c=0;
            for(int j: a){
                if(i==j){
                    c++;
                }
            }
            if(c==1){
                System.out.println((char)i);
                break;
            }
        }
        
        }
 }
 //integration testing