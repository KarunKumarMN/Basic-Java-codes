//large even no

class LargeEven{
    public static void main(String args[]){
        int a[]={11,3,5,7};
        //select the even value as referece
      
    //find the min
        int min=a[0];
        int count=0;
        for(int i=0;i<a.length;i++){

            if(a[i]<min && a[i]%2==0){
                min=a[i];
                count++;

            }
        }
        if(count==0){
            System.out.println("no even elements are present in an array");
            return;
        }
    //to find the second largest element
        for(int i=0;i<a.length;i++){

            if(a[i]>min && a[i]%2==0){
                min=a[i];
            }
        }
        System.out.println(min);

    }
}