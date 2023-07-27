class A{
//    private int a=4;
//    protected int a=5;
    public int a=7;
    int get(){
        return a;
    }
}
public class P012_Access_Modifiers  {
    public static void main(String[] args){
        A t1=new A();
        System.out.println(t1.a);
        System.out.println(t1.get());

    }
}
