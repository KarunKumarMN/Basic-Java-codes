// * * * * * 
//   * * * *
//     * * *
//       * *
//         *
class Pattern1{
    public static void main(String arg[]){
        int n=5,l=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                System.out.print("* ");
                 }
                else{
                System.out.print("  ");
                }
           }
            System.out.println();

        }
    }
}