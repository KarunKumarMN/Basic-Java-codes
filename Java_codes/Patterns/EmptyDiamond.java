class EmptyDiamond{
    public static void main(String arg[]){
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("| ");
            for(int j=1;j<=n;j++){
                if((j>=i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for(int j=1;j<=n*2;j++){
            System.out.print("--");
        }
        System.out.println("");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
             System.out.print("| ");
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }
}