 class ArrayReverse{
    public static void main(String[] karun){
        int a[]={1,2,3,45,5,1,5,6,7};
        int m=a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[m];
            a[m]=temp;
            m--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
}