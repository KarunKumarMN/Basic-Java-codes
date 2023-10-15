class Parameter{
    static    Parameter m=new Parameter();

    static void swap(Parameter m){
        int temp=m.a;
        m.a=m.b;
        m.b=temp;
    }
    public static int main(String args[]){
        int a=1;
        int b=10;
        System.out.println(a+" "+b);
        s.swap(m);
        System.out.println(a+" "+b);


    }
}