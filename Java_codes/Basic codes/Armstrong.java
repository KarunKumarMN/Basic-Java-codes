import java.util.*;
//check the armstrong numbers between the range
class Armstrong{
        static boolean arm(int n){
            String s=""+n;
            int len=s.length();

            int sum=0,ref=n;

            while(ref!=0){
                int rem=ref%10;
                sum+=Math.pow(rem,len);
                ref=(int)(ref/10);
            }
            // System.out.println(sum);
            if(sum==n){
                return true;
            }
            return false;
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ss=sc.nextInt();
        int e=sc.nextInt();
        for(int i=ss;i<=e;i++){
            if(arm(i)){
                System.out.println(i+ " is armstrong");
            }
            
        }

        
        }
 }