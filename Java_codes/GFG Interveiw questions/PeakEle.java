class PeakEle{
    public static void main(String args[]){
        int a[]={4,3,2,6,78,5,3,1,3,5,6,7,9,0};

        //to check first and last are peak or not
        if(a[0]>=a[1]){
            System.out.print(a[0]+" ");
        }
        if(a[a.length-1]>a[a.length-2]){
            System.out.print(a[a.length-1]+" ");

        }

        //to check all other elements
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                System.out.print(a[i]+"  " );
            }
        }

    }
}