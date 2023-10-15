//ASCII american standard code for information interchange
//A=65 Z=90
//a=97 z=122
// A B C D E F G H I J  
// A B C D E F G H I  
// A B C D E F G H  
// A B C D E F G  
// A B C D E F  
// A B C D E
// A B C D
// A B C
// A B
// A

class Alphabet{
    public static void main(String ar[]){
        int n=26;
        for(int j=n;j>0;j--){

            for(int i=65;i<65+j;i++){
                System.out.print((char)i+" ");
            }
        System.out.println(" ");
        }
    }
}