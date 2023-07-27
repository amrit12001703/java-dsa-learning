class MyClass {
    int data;

    void setter(int data) {
        this.data = data;
    }

    int getter() {
        return data;
    }
}
public class P011_Class_Objects {
    public static void main(String[] args){
        MyClass c1=new MyClass();
        c1.setter(45);
        System.out.println(c1.getter());
    }
}
