import java.util.Scanner;

class Person{
    int age;
    String name;
}
class ArrayOfObjects{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Person p[]=new Person[4];
        for(int i=0;i<p.length;i++){
            p[i]=new Person();
        }

        for(int i=0;i<p.length;i++){
            System.out.println("enter the name");
            p[i].name=sc.next();
            System.out.println("enter the age");
            p[i].age=sc.nextInt();

        }
         for(int i=0;i<p.length;i++){
            System.out.println(" name: "+p[i].name);
            System.out.println(" age: "+p[i].age);

        }
        
    }
}