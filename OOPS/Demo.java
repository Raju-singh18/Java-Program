 

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="Raju";
        s1.age=22;
        s1.rollNumber=43;
        s1.college="IIT Guwahati";

        s2.name="Aditya";
        s2.age=28;
        s2.rollNumber=102;
        s2.college="IIT Guwahati";

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence(){
        System.out.println("Attendence marked by "+name);
    }

    void print(){
        System.out.println(name+" , "+ age+" , "+rollNumber+" , "+college);
    }
}

// Java is almost complete onject oriented programming