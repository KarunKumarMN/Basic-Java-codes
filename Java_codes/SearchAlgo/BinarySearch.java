//for sorted array

class BinarySearch{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    // int[] a={1,2,4,5,6,7,88,89,90};
    // int key=6;
   float[] a={1.98f,3.76f,5.98f,6.7878f,8.9089f,9.8937f,11.3343f};
    float key=3.76f;
    int l=0;
    int h=a.length-1;
    while(l<=h){
        int mid=(l+h)/2;
        if(a[mid]==key){
            System.out.println("element found");
            return;//come out of the programm and break come out of the loop
        }
        else if(a[mid]>key){
            h=mid-1;
        }
        else
        {
            l=mid+1;
        }
    }
    if(l>=h){
        System.out.println("not found");
    }
    System.out.println("hiiji");
   
}}


// class BinarySearch {
//     public static void main(String[] args) {
//         int[] a = {1,2,23}; // Sorted array
//         int key = 1;
//         int l = 0, h = a.length - 1;
//         int m;

//         while (l <= h) {
//             m = (l + h)/ 2; // Calculate the middle index
//             System.out.println(l+" "+h+" "+m);
//             if (a[m] == key) {
//                 System.out.println("Found at index " + m);
//                 return; // Exit out of the program
//             } else if (a[m] < key) {
//                 l = m + 1;
//             } else {
//                 h = m - 1;
//             }
//         }

//         System.out.println("Element not found");
//     }
// }
