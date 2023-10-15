//for unsoted array
class LinearSearch{
    public static void main(String arg[]){
    int[] a={6,1,2,4,5,6,6,7,88,89,90};
    int key=6;
        // float[] a={1.98f,3.76f,5.98f,6.7878f,8.9089f,9.8937f,11.3343f};
        // float key=3.76f;
        int c=0;
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
            // System.out.println(a[i] +" at intdex "+ i);
            c++;
            }
        }
        System.out.println(c);
    }
}