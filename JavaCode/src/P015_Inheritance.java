class Employee{
    int id;
    int salary;
    Employee(int i,int s){
        id=i;
        salary=s;
    }
}

class SalesEmployee extends Employee{
    int salesIncentive;
    SalesEmployee(int id,int salary,int salesIncentive){
        super(id,salary);
        this.salesIncentive=salesIncentive;
    }

}
public class P015_Inheritance {
    public static void main(String[] args){

        SalesEmployee se=new SalesEmployee(101,30000,10000);
        System.out.println(se.id+","+se.salary+","+se.salesIncentive);

    }
}
