class MoveZero{
    public static void main(String args[]){
        int a[]={0,0,0,1};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }
        while(j<a.length){
            a[j]=0;
            j++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}