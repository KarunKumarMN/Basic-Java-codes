class add1{
     void add(int a,long b){
        System.out.println(a+b);
     }
      void add(double a,double b){
        System.out.println(a+b);
     }
}

class add2{
     void add(int a,long b){
        System.out.println(a+b);
     }
      void add(long a,int b){
        System.out.println(a+b);
     }
}

class MainAdd{
    public static void main(String args[]){
        add1 a1=new add1();
        add2 a2=new add2();
        int x=10,y=20;

        //this work based on type conversion
        a1.add(x,y);

        //this gives compile time error errror beacause after type conversion also it gives ambiguity
        //the method in add2 class after the numeric type promotion it gives ambigity so it give ct error.
        // a2.add(x,y);
    }
}