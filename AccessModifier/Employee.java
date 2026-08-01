 

public class Employee {
    int salary=50000;
    void display() {
        System.out.println("Salary = " + salary);
    }
 public static void main(String[] args) {
    Employee e1 = new Employee();
    System.out.println(e1.salary);
    e1.display();
 }   
}
