class EmptyTri{
    public static void main(String arg[]){

        int n=20;
        int m=n;
        int c=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n*2;j++){
                if(j>m && j<m+c+1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            c=c+2;
            m--;
            System.out.println("");
        }
    }
}