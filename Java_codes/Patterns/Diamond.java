//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

class Diamond{
    public static void main(String arg[]){
        int n=5;
//logic with the small code
        for(int i=1;i<=n*2;i++){
            int space=Math.abs(n-i);
            int star=n-space;

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

//general logic

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n-1;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


    }
}