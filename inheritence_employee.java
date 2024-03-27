import java.util.*;

class employee
{
    String ename;
    int basic_salary;
    static  int count;
    {
        count++;
    }
    //default constructor
    public employee()
    {
        basic_salary = 0;
        ename = "NA";
    }
    //overload countructor
    public employee(String name,int bs){
        ename = name;
        basic_salary = bs;
    }
    //copy counstructor
    public employee(employee e){
        ename = e.ename;
        basic_salary = e.basic_salary;
    }
    //setter
    public void setname(String name){
        ename = name;
    }   
    //getter
    public String getname(){
        return ename;
    }
    //printing detail
    public void printEmployeeDetail(){
        System.out.println("employee name:"+ename+" basic salary is :"+basic_salary);
    } 
    //count
    static int countemployee()
    {
        return count ;
    }
    
}
//subclass
class salesmanager extends employee{
    protected int salesamount;
    public salesmanager(){
        basic_salary = 0;
        ename = "NA";
        salesamount= 0;
    }
    //
    public salesmanager(int bs,String name,int sa){
        basic_salary = bs;
        ename = name;
        salesamount = sa;
    }
    public void printEmployeeDetail(){
        System.out.println("employee name:"+ename+" basic salary is :"+basic_salary+" sales amount is : "+salesamount);
    }
    public void getnetincome(){
        System.out.println("net income is "+ basic_salary+0.05*salesamount);

    }
}   
    
public class inheritence_employee 
{
    public static void main(String[] args)
    {
        employee e1 = new employee("1",1000);
        employee e2 = new employee("2",2000);
        salesmanager s1 = new salesmanager(1000, "3", 100);
        employee e4 = new employee(e2);
        e1.printEmployeeDetail();
        e2.printEmployeeDetail();
        e2.setname("raju"); // prints after e2
        e2.printEmployeeDetail();
        s1.printEmployeeDetail();
        s1.getnetincome();
        System.out.println(employee.countemployee());
        e2.printEmployeeDetail();
    }
    
}
