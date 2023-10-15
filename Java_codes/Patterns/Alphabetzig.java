class Alphabetzig{
    public static void main(String arg[]){
        int n=6;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                if(count%2==0){
                    System.out.print((char)(64+count)+" ");
                    }
                else{
                    System.out.print((char)(96+count)+" ");
                }
            }
            System.out.println("");
        }
    }
}