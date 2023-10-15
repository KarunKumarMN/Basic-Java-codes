import java.util.*;
class CountChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int cu=0,cl=0,cs=0,cd=0;
        for(char i:a){
            if(i==' ')cs++;
            if(i>=65 && i<=90)cu++;
            if(i>=97 && i<=122)cl++;
            if(i>=48 && i<=57)cd++;
        }
    System.out.println("capital letters count is "+ cu);
            System.out.println("small letters count is "+cl);
    System.out.println("digit  count is "+cd);
    System.out.println("space  count is "+cs);

        }
        
}