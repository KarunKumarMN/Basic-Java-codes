

class MutableString{
    public static void main(String args[]){
        StringBuilder s=new StringBuilder();//default capacity is 16
         System.out.println(s.capacity());//16
        System.out.println(s.length());//0

        s.append("karun");
        System.out.println(s.capacity());//16
        System.out.println(s.length());//5
        s.append(" kuamrdfdfdfdfddfdfdf");//if the cpacity is not enough to store than it will increase the size be using the (formula existing_capacity*2+2)
        System.out.println(s.capacity());//16
        System.out.println(s.length());//5
    }
}