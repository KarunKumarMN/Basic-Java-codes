class BinaryRec{
     public static boolean bin(int[] a,int mid,int low,int high,int key){
            mid=(low+high)/2;
            if(low>high){
                return false;
            }
           else if(a[mid]==key){
                System.out.println(mid);

                return true;
            }
            else if(a[mid]>key){
                high=mid-1;
                 return bin(a,mid,low,high,key);

            }
            else {
                low=mid+1;
                return bin(a,mid,low,high,key);

            }
           
        }
    public static void main(String args[]){
       int a[]={1,2,3,4,23,45,67};
       int key=2;
       int low=0;
       int high=a.length-1;
       int mid=0;
       if(bin(a,mid,low,high,key)){
        System.out.println("found");
       }
       else{
        System.out.println("not found");
       }

    }
}