import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Raju", 90);
        Student s2 = new Student("Rohit", 90);

        TreeSet<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println(set.size());
    }

    static class Student implements Comparable<Student> {
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // @Override
        // public int compareTo(Student other){
        // return this.marks-other.marks;
        // }

        @Override
        public int compareTo(Student other) {
            if (this.marks != other.marks) {
                return this.marks - other.marks;
            }
            return this.name.compareTo(other.name);
        }

    }
}
