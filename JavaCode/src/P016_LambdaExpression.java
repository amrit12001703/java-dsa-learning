import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P016_LambdaExpression {

    public static void main(String[] args){
        List<Integer> li=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        li.stream().filter(x->x%2==0).forEach(System.out::println);
    }

}
