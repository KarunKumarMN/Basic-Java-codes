abstract class Vehicle{
    void type(){
        System.out.println("use me to create a vehicle obj");
    }
}
class car extends Vehicle{

    String name;
    car(String name){
        System.out.println("counstructor is created");
        this.name=name;
        System.out.println(name);
    }
    void type(){
        System.out.println("iam overrided method");
        System.out.println(name);
    }
    void car(){
        System.out.println("the car is created");
    }
    void car(int car_num){
        System.out.println(car_num);
    }
}

class All{
    public static void main(String args[]){

        car c=new car("honda");
        c.name="karun";
        c.type();
        c.car();
        c.car(5);

    }
}