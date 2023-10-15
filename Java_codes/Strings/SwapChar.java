class SwapChar{
    public static void main(String args[]){
        char a='k';
        char b='a';
        System.out.println(a+" "+b);

        a=(char)(a+b);
        b=(char)(a-b);
        a=(char)(a-b);
        System.out.println(a+" "+b);
    }
}