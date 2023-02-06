package FP;
public class Employee{

    private int id;
    private String name;
    private String dept;
    private double salary;
    private Role role;

    public Employee(int id, String name, String dept, double salary, Employee.Role role){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.role = role;


    }

    public void work(){
        System.out.print("yes");
    }

    public enum Role{
        Manager,
        Tester,
        Developer{
        }
    }
    

}
