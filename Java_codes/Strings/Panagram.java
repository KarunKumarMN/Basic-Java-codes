import java.util.Scanner;
class Panagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.nextLine().toCharArray();
        int n=0;
        for(char i: a){
            n++;
        }
        int count=0,c1=0;
         for(int i=97;i<123;i++){
            count=0;
            for(int j:a){
                if(j==i){
                    count++;
                }
            }
            if(count>0){
                c1++;          
          }
        }
        if(c1==26){
                System.out.println("panagram");
            }
        else{
            System.out.println("not a panagram");
        }
    }
}