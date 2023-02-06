package FP;
import java.util.stream.Stream;

import FP.Employee.Role;

import java.util.*;


class Main{
public static void main(String[] args) {
   
  Main m = new Main();
  m.printEmployees(m.EmployeeCreater());

}



//TODO: Functional programming= making functions? 



public List<Employee> EmployeeCreater(){
    List<Employee> People = List.of(new Employee(1, "John", "R&D", 10000, Role.Manager),
    new Employee(2, "Max", "R&D", 13000, Role.Developer), new Employee(3, "Anne", "R&D", 12000, Role.Tester));
    People.add(new Employee(1, "John", "R&D", 10000, Role.Manager));
    People.add(new Employee(2, "Max", "R&D", 13000, Role.Developer));
    People.add(new Employee(3, "Anne", "R&D", 12000, Role.Tester));
    return People;
    
}

// TODO: Not to do any oop only fp 
 

public void printEmployees(List<Employee> Employees){
        Employees.stream() .forEach( Employees : List<Employee>);
}




//Object Employee = {String name = "Bob";
//int age = 22; double salary = 1000;  String[] Projects = {"PPG Signal", "Thorax Signal"}; String Role = "Manager";}






//public Employee Manager(){
  //  return Emp(1, "john", "yes", 10000);
//}
//public Employee Tester(){}
//public Employee Developer(){}

}