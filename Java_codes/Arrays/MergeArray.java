class MergeArray{
    static int[] merge(int[] a, int[] b){
        int c[]=new int[a.length+b.length];
        int i=0;
        int k=0;

        for(i=0;i<a.length;i++){
            c[k]=a[i];
            k++;
        }
        for(int j=0;j<b.length;j++){
            c[k]=b[j];
            k++;
        }
        return c;
        
    }
    public static void main(String args[]){
        int[] a={1,8,9,6,5,6,564,8};
        int[] b={84,53,4,2,2,4,4,6,67,543,434,5,7};
        a=merge(a,b);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}