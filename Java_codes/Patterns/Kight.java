class Kight{
    public static void main(String args[]){
        int n=5;
        //Upper part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(i==n || j==1 || j==2*i-1 || j== (2*i-1)/2 +1){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");      
          }

        //Lower part
          for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(n*2-1)-2*i;j++){
                if( j==1 || j==(n*2)-2*i-1 || j== n-i){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");      
          }
    }
}