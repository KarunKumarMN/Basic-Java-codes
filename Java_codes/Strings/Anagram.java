import java.util.*;
class Anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enthe tthe string 1");
        char a[]=sc.nextLine().toCharArray();
    
        System.out.println("enter the string 2");
        char b[]=sc.nextLine().toCharArray();
       
        int c=0,d=0;
        int flag=0;
        for(int i=0;i<256;i++){
            c=0;
            d=0;

            for(int j:a){
                if(i==j){
                    c++;
                }
            }
            for(int k: b){
                if(i==k){
                    d++;

                }
            }
            if(c!=d){
                flag=1;
                System.out.println("not a anagram ");
                break;
            }
        }
        if(flag==0){
            System.out.println("yes it is anagram");
        }


    }
}