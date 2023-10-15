class Student1 {

  String name;
  int age;
  float height;

  void setData(String n, int a, float h) {
    name = n;
    age = a;
    height = h;
  }

  //this is the correct way but its not good way t0 use the different name for the same variable;
  void getData() {
    System.out.print(this.name + " " + this.age + " " + this.height);
    System.out.println("");
  }
}

//the below is the shadowing case
class Student2 {

  String name;
  int age;
  float height;

  void setData(String name, int age, float height) {
    name = name;
    age = age;
    height = height;
    //this is the name clash situation
  }

  //logically fails beacuse we use local variabels names as same as the insatance variable so if we made any change locally to local variable it reflects on local variable itself
  void getData() {
    System.out.print(this.name + " " + this.age + " " + this.height);
    System.out.println("");
  }
}

class Student3 {

  String name;
  int age;
  float height;

  //this is used to classify between local and instance variable

  void setData(String name, int age, float height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  //this is the universal standard way
  void getData() {
    System.out.print(this.name + " " + this.age + " " + this.height);
    System.out.println("");
  }
}

class Shadowing {

  public static void main(String args[]) {
    Student1 s1 = new Student1();
    Student2 s2 = new Student2();
    Student3 s3 = new Student3();
    s1.setData("karun", 21, 5.5f);
    s2.setData("arun", 22, 5.5f);
    s3.setData("nagaraj", 23, 5.5f);
    s1.getData();
    s2.getData();
    s3.getData();
  }
}
