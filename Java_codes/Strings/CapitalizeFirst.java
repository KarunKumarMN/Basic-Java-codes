import java.util.*;
class CapitalizeFirst{
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

                char a[]=sc.nextLine().toCharArray();
        int n=0;
        for(char i: a){
            n++;
        }
       //to chek first char is small or cap , if small conv to cap
        if(a[0]>96&&a[0]<123){
            a[0]=(char)(a[0]-32);
        }

        for(int i=1;i<n;i++){

            if(a[i-1]!=' '&& (a[i]>64&&a[i]<91)){
                a[i]=(char)(a[i]+32);
            }

            if(a[i]==' ' && i!=n-1){
                 if(a[i+1]>96&&a[i+1]<123){

                     a[i+1]=(char)(a[i+1]-32);
        
                }
            }


        }










    System.out.println(a);

    }

}