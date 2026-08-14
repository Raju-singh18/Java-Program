
public class Pojo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Raju Singh", 10000);
        System.out.println(e1.getSalary());
    }
}
class Employee {

    private int id;
    private String name;
    private double salary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary + '}';
    }
}

// POJO Classes => Plain Old Java Object
// Do not contain hard core Business logic
// 1. Anemic Model
// 2. rich Domian model
