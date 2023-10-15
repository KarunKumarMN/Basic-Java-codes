// class LargestPrimeInArray{
//     public static void main(String args[]){
//         int a[]={1,2,3,4,5,6,7,8,9,97,87,10};
//         int lp=a[0];
//         for(int i=0;i<a.length;i++){
//             int count=0;
//             for(int j=1;j<=a[i];j++){
//                 if(a[i]%j==0){
//                     count++;
//                 }
//             }
//             if(count==2 && a[i]>lp){
//                 lp=a[i];

//             }
//         }
//         System.out.println(lp);
//     }
// }

import java.util.Scanner;
class LargestPrimeInArray{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        int n=sc.nextInt();//size of the array

        int a[]=new int[n];

//to take the array input
// System.out.println("Enter the elements of the array");

        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }

int sum=1;
for(int i=0;i<=a.length-1;i++){
            sum=sum*a[i];

        }
ddSystem.out.println(sum);

//to print the array
// System.out.println("the elements of the array is");
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }




    }
}