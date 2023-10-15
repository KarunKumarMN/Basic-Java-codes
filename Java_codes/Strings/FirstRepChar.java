//prog to print the how many occurance of the first char are in the given string

import java.util.*;
class FirstRepChar{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int n=0;
        for(char i: a){
            n++;
        }
        for(int i:a){
            int c=0;
            for(int j:a){
                if(i==j){
                    c++;
                }
            }
            if(c>1){
                System.out.println((char)i+" occurs "+c+" times");
                break;
            }
        }
    }
}