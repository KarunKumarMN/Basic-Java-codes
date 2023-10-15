class SimpleMethod{
    static int add(int a, int b){
        a=b;
        return a;
    }
    public static void main(String args[])
    {   int a=9,b=8;
        add(a,b);
        System.out.println(a+" "+b);
    }
}