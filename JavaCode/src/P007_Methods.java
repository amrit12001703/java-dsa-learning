class Addition{
    int sum=0;
    public int addTwoNum(int a,int b){
        sum=a+b;
        return sum;
    }
}

public class P007_Methods {
    public static void main(String[] args){
        Addition addition=new Addition();
       System.out.println(addition.addTwoNum(4,5));
    }
}
