// import java.util.*;
// class Frequency{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         char a[]=sc.nextLine().toCharArray();
//         int n=0;
//         for(char i: a){
//             n++;
//         }
//         int ch[]=new int[256];
//         for(int i : a){
//             ch[i]++;

//         }
//         for(int i=0;i<256;i++){
//             if(ch[i]!=0){
//                 System.out.print((char)i);
//                 System.out.println(" count is "+ch[i]);
//             }
//         }

//     }
// }
import java.util.*;
class Frequency{
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int n=0;
        for(char i: a){
            n++;
        }
        int count=0;
        for(int i=0;i<256;i++){
            count=0;
            for(int j:a){
                if(j==i){
                    count++;
                }
            }
            if(count>0){
                System.out.println((char)i +" count is "+count);
            }
        }



    }
    }