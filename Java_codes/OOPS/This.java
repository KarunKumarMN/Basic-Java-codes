class Demo{
    int a;
    int b;
}

    //this is used to classify between local and instance variable
//this is used to refer the current object
class This{
     int age;
     int height;

    public static void main(String args[]){
        This t=new This();
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.a=10;
        d1.b=20;
        d2.a=100;
        d2.b=200;
        d3.a=1000;
        d3.b=2000;
        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d2.a);
        System.out.println(d2.b);
        System.out.println(d3.a);
        System.out.println(d3.b);
       
    }
}