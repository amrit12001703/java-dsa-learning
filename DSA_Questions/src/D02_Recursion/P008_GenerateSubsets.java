package D02_Recursion;

public class P008_GenerateSubsets {

    public static void generateSubset(String str,int ind,String curr){

        if(ind==str.length()){
            System.out.println(curr);
            return;
        }
        generateSubset(str,ind+1,curr);
        generateSubset(str,ind+1,curr+str.charAt(ind));


    }
    public static void main(String[] args){
        String str="abc";
        generateSubset(str,0,"");

    }
}
