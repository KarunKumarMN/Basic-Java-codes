import java.util.*;
//pro to count the vowels in string
class VowelsCount{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        char b[]={'a','e','i','o','u','A','E','I','O','U'};
        int c=0;
        for( int i : a){
            for(int j:b){

                if((i==j)){
                    c++;
                }
                
            }
        }
        System.out.println(c);
        
        
        }
 }