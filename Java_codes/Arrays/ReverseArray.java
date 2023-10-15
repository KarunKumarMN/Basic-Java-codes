class ReverseArray{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,4,8};
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
         for( i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}