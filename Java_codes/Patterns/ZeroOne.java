// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

class ZeroOne{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==j%2){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
        System.out.println("");

        }
    }
}