class RemoveElement{
    static int[] remove(int[] a,int x){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                count++;
            }
        }
        int j=0;
        int b[]=new int[a.length-count];
        for(int i=0;i<a.length;i++){
            if(a[i]!=x){
                b[j]=a[i];
                j++;
            }
        }
        return b;
    }
    public static void main(String args[]){
        int[] a={1,3,4,3,2,4};

        System.out.println("before deletion");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");

        int x=3;
        a=remove(a,x);
        
        System.out.println("after deletion");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}