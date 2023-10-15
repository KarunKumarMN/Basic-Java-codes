class GCD{
    public static void main(String areg[]){
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);

    }
}