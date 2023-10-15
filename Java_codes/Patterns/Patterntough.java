//         *                 *                 * 
//       * * *             * * *             * * * 
//     * * * * *         * * * * *         * * * * * 
//   * * * * * * *     * * * * * * *     * * * * * * * 
// * * * * * * * * * * * * * * * * * * * * * * * * * * * 
class Patterntough{
    static void space(int a){
        for(int j=1;j<=a;j++){
                System.out.print("  ");
            }
    }
    static void star(int a){
        for(int k=1;k<=a;k++){ 
                System.out.print("* ");
            }
    }
    public static void main(String a[]){
        int n=5;
        for(int i=1;i<=n;i++){
            space(n-i);
            star(i*2-1);
            space((n-i)*2);
            star(i*2-1);
            space((n-i)*2);
            star(i*2-1);
            System.out.println("");
        }


    }
}