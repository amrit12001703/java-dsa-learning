//Final in variable
class Test{
   static final int a,b;
    static {a=10;b=15;}
    final int function(){
        return a+b;
    }
}
//final in method
class Test2 extends Test{
    static final int a,b;
    static {a=10;b=15;}
//    final int function(){ //Error
//        return a+b;
//    }
}


//Final in class
final class Test3{
    int a=0;
    int b=9;
}

//Error
//class Test4 extends Test3{
//
//}


public class P014_Final_Keyword {



    static final int b; //Instance final var
    static{b=10;}//can add condition if any or can add constructor to initialise
    public static void main(String[] args){
        final int a;
        a=4;//local final var
//        a=5;//error
        System.out.println(a);
        System.out.println(b);
    }
}
