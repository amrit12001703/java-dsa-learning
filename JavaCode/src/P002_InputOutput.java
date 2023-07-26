import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P002_InputOutput{
    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String input1=bufferedReader.readLine();
        int input11=Integer.parseInt(input1);
        System.out.println(input1 +"-"+ input1.getClass());
        System.out.println(input11 +"-"+ input11);

        //Scanner
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        int integer=sc.nextInt();
        boolean bool=sc.nextBoolean();

//        Used in Console
//        String name = System.console().readLine();

//        System.out.println(name);


    }
}